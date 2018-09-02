var AWS = require('aws-sdk');

var s3 = new AWS.S3();

// Bucket names must be unique across all S3 users

var myBucket = 'akashkravi-1';

var myKey = 'akashkravi-1K';

s3.createBucket({Bucket: myBucket}, function(err, data) {

if (err) {

   console.log(err);

   } else {

     params = {Bucket: myBucket, Key: myKey, Body: 'Hello123'};

     s3.putObject(params, function(err, data) {

         if (err) {

             console.log(err)

         } else {

             console.log("Successfully uploaded data to myBucket/myKey");

         }

      });

   }

});