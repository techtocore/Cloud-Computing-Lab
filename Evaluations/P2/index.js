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


app.post('/gets3', function (req, res) {

    var myBucket = 'akashkravi-eval-2';
    var myKey = 'data.json';

    var sport = req.body.sport;
    console.log(sport);

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
            //console.log(json);
            console.log("fetched successfully");

            var g, s, b, t;

            for (var Sport in json) {
                if (json.hasOwnProperty(Sport)) {
                    var val = json[Sport];
                    //console.log(val.Sport);
                    if (val.Sport == sport) {
                        g = val.first;
                        s = val.Second;
                        b = val.Third;
                        t = val.Total;
                        console.log('found');
                        var ret = {
                            g: g,
                            b: b,
                            s: s,
                            t: t
                        };
                        res.json(ret);
                    }
                }
            }
            //res.send(cgpa);
        }      // successful response
    });
    //res.send();
});


app.post('/gets31', function (req, res) {

    var myBucket = 'akashkravi-eval-2';
    var myKey = 'data.json';

    var med = req.body.med;

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
            //console.log(json);
            console.log("fetched successfully");

            var str = "";

            for (var Sport in json) {
                {
                    var val = json[Sport];
                    //console.log(val.Sport);
                    if (med === 'first')
                        str += (val.Sport + " (" + val.first + "), ");
                    else if (med === 'Second')
                        str += (val.Sport + " (" + val.Second + "), ");
                    else if (med === 'Third')
                        str += (val.Sport + " (" + val.Third + "), ");
                    else
                        str += (val.Sport + " (" + val.Total + "), ");

                }
            }
            var ret = {};
            ret.str = str;
            res.json(ret);
            //res.send(cgpa);
        }      // successful response
    });
    //res.send();
});



app.post('/gets32', function (req, res) {

    var myBucket = 'akashkravi-5';
    var myKey = 'data1.json';

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
            //console.log(json);
            console.log("fetched successfully 2");

            var st = [];

            var keys = Object.keys(json);
            for (var i = 0; i < keys.length; i++) {
                var tp = [];
                var key = keys[i];
                //console.log(json[key]);
                tp.push(json[key].Sport);
                tp.push(json[key].Gold);
                st.push(tp);
            }

            var ret = {};
            ret.st = st;
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