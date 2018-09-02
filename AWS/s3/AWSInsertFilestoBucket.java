
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class insertfiles {

    public static BasicAWSCredentials creds=null; 
      
   
    private static final String bucketName = "mytenthbucket";

    public static void main(String[] args) throws IOException {
      creds = new BasicAWSCredentials("", "");
      String path="C:\\sample\\semanticweb\\sample.rdf";
      String foldername="semanticweb/sample.rdf";
      AmazonS3 s3 = AmazonS3Client.builder().withRegion(Regions.AP_SOUTHEAST_1).withCredentials(new AWSStaticCredentialsProvider(creds)).build();
      PutObjectResult res=s3.putObject(new PutObjectRequest(bucketName, foldername, new File(path)));
        System.out.println( res.toString());
              
    }
}