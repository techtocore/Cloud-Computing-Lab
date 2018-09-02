var express = require('express');
var AWS = require('aws-sdk');

var s3 = new AWS.S3();

var bodyParser = require('body-parser')
var app = express();

app.use(function (req, res, next) {
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', '*');
    res.setHeader('Access-Control-Allow-Headers', '*');
    res.setHeader('Access-Control-Allow-Credentials', true);
    next();
});

app.get('/', function (req, res) {
    res.send("I'm listening");
});


app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())


app.post('/adds3', function (req, res) {
    // var url = req.body.text;

    var s3data = {};
    var myBucket = 'akashkravi-eval-1';
    s3data.name = req.body.name;
    s3data.reg = req.body.regno;
    s3data.c1 = req.body.c1;
    s3data.c2 = req.body.c2;
    s3data.c3 = req.body.c3;
    s3data.g1 = req.body.g1;
    s3data.g2 = req.body.g2;
    s3data.g3 = req.body.g3;

    //var str = req.body.regno;

    var myKey = 'akashkravi-eval-' + req.body.regno;


    console.log("data:" + JSON.stringify(s3data));


    s3.createBucket({ Bucket: myBucket }, function (err, data) {

        if (err) {

            console.log(err);

        } else {

            params = { Bucket: myBucket, Key: myKey, Body: JSON.stringify(s3data) };

            s3.putObject(params, function (err, data) {

                if (err) {

                    console.log(err)

                } else {

                    console.log("Successfully uploaded data to myBucket/myKey");

                }

            });

        }

    });

    var json = {
        "status": "stored"
    };
    // console.log(req.body);
    res.json(json);
});


app.post('/gets3', function (req, res) {

    var myBucket = 'akashkravi-eval-1';
    var myKey = 'akashkravi-eval-' + req.body.reg;

    var params = {
        Bucket: myBucket,
        Key: myKey
    };
    s3.getObject(params, function (err, data) {
        if (err) console.log(err, err.stack); // an error occurred
        else {
            const body = Buffer.from(data.Body).toString('utf8');
            //console.log(body);
            var json = JSON.parse(body);

            var gr1;
            if (json.g1 == 'A')
                gr1 = 1;
            else gr1 = 0.5;
            var gr2;
            if (json.g2 == 'A')
                gr2 = 1;
            else gr2 = 0.5;
            var gr3;
            if (json.g3 == 'A')
                gr3 = 1;
            else gr3 = 0.5;
            var cgpa = (parseInt(json.c1) * gr1 + parseInt(json.c2) * gr2 + parseInt(json.c3) * gr3) / 3;
            console.log(cgpa);
            var ret = {};
            ret.cg = cgpa;
            ret.name = json.name;
            ret.reg = json.reg;
            res.json(ret);
            //res.send(cgpa);
        }      // successful response
    });
    //res.send();
});


const PORT = 3000;
const HOST = '0.0.0.0';


app.listen(PORT, HOST);
console.log('Running on http://${HOST}:3000');