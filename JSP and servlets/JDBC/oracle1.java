package jdbc;

import java.sql.*;
import java.util.*; 

public class oracle1 {

	public static void main(String[] args) {
		//Creating the connection 
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
        String user = "dbms_lab"; 
        String pass = "****"; 
  
        //Entering the data 
        /*
        Scanner k = new Scanner(System.in); 
        System.out.println("enter name"); 
        String name = k.next(); 
        System.out.println("enter roll no"); 
        int roll = k.nextInt(); 
        System.out.println("enter class"); 
        String cls =  k.next(); 
        */
  
        //Inserting data using SQL query 
        String sql = "insert into customers values('202', 'Ravi')"; 
        Connection con=null; 
        try
        { 
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
  
            //Reference to connection interface 
            con = DriverManager.getConnection(url,user,pass); 
  
            Statement st = con.createStatement(); 
            int m = st.executeUpdate(sql); 
            if (m == 1) 
                System.out.println("inserted successfully : "+sql); 
            else
                System.out.println("insertion failed"); 
            System.out.println("Printing Records");
            ResultSet rs = st.executeQuery("select * from customers");  
            System.out.println(rs);
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2));  

            con.close(); 
        } 
        catch(Exception ex) 
        { 
            System.err.println(ex); 
        }

	}  
} 
