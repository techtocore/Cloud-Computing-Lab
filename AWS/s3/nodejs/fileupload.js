var AWS = require('aws-sdk');
var fs =  require('fs');

var s3 = new AWS.S3();

// Bucket names must be unique across all S3 users

var myBucket = 'akashkravi-1';

var myKey = 'jpeg';
//for text file
//fs.readFile('demo.txt', function (err, data) {
//for Video file
//fs.readFile('demo.avi', function (err, data) {
//for image file                
fs.readFile('demo.jpg', function (err, data) {
  if (err) { throw err; }



     params = {Bucket: myBucket, Key: myKey, Body: data };

     s3.putObject(params, function(err, data) {

         if (err) {

             console.log(err)

         } else {

             console.log("Successfully uploaded data to myBucket/myKey");

         }

      });

});