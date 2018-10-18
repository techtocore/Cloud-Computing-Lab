var express = require('express');
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

var country = [];
var val = [];

app.post('/addCountry', function (req, res) {
    // var url = req.body.text;
    var json = {
        "msg": "stored"
    };
    country.push(req.body.country);
    var p = parseInt(req.body.pop);
    var g = parseInt(req.body.gdp);
    if (p < 1) p++;
    var temp = g / p;
    val.push(temp);
    res.json(json);
    console.log(val.length);
    //res.send();
});


app.get('/getval', function (req, res) {
    var json = {};
    json.ct = country;
    json.val = val;
    res.json(json);
    console.log(val.length);
});

const PORT = 3000;
const HOST = '0.0.0.0';


app.listen(PORT, HOST);
console.log('Running on http://${HOST}:3000');