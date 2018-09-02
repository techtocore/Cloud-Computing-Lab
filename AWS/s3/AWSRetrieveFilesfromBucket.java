
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.S3Object;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class insertfiles {

    public static BasicAWSCredentials creds=null; 
      
   
    private static final String bucketName = "mytenthbucket";

    public static void main(String[] args) throws IOException {
      creds = new BasicAWSCredentials("", "");
      String path="C:\\sample\\semanticweb\\sample.rdf";
      String foldername="semanticweb/sample.rdf";
      AmazonS3 s3 = AmazonS3Client.builder().withRegion(Regions.AP_SOUTHEAST_1).withCredentials(new AWSStaticCredentialsProvider(creds)).build();
      S3Object s3object = s3.getObject(bucketName, foldername);
        try (InputStream inputStream = s3object.getObjectContent()) {
            Files.copy(inputStream, Paths.get("C:\\Users\\Gowtham\\Desktop\\Gowtham.rdf"));
        }
    }
}

    
    

