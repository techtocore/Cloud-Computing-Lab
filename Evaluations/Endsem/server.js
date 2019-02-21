var express = require('express');
var bodyParser = require('body-parser');
var cors = require('cors');
var path = require("path");
var AWS = require('aws-sdk');


AWS.config = new AWS.Config();
AWS.config.accessKeyId = "";
AWS.config.secretAccessKey = "";
AWS.config.region = "us-east-1";


var s3 = new AWS.S3();
var express = require('express'),
    app = express(),
    port = process.env.PORT || 3000;

app.use(cors());


app.use(bodyParser.urlencoded({ extended: false }))
app.use(bodyParser.json())

app.use(express.static(__dirname));


app.get('/', function (req, res) {
    res.sendFile(path.join(__dirname + 'index.html'));
});

app.get('/list', function (req, res) {
    res.sendFile(path.join(__dirname + '/list.html'));
});

app.post('/', function (req, res) {
    //res.send("I'm listening");
    var json = req.body;
    console.log(json);

    var myBucket = 'akashkravi-endsem';
    var myKey = 'akashkravi-' + json.emailid + ".json";

    s3.createBucket({ Bucket: myBucket }, function (err, data) {
        if (err) {
            console.log(err);
        } else {
            params = { Bucket: myBucket, Key: myKey, Body: JSON.stringify(json) };
            s3.putObject(params, function (err, data) {
                if (err) {
                    console.log(err)
                } else {
                    console.log("Successfully uploaded data to myBucket/myKey");
                    res.send("done");
                }
            });
        }
    });
});



app.post('/gets3', function (req, res) {

    var myBucket = 'akashkravi-endsem';
    var myKey = 'akashkravi-' + req.body.emailid + ".json";

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
            res.json(json);

            //res.send(cgpa);
        }      // successful response
    });
    //res.send();
});


app.listen(port, function () {
    console.log('Server listening on ', port);
})