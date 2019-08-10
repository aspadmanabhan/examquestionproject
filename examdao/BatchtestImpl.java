package exam ;
import java.sql.*;
public class BatchtestImpl implements BatchtestDAO
  {
     
   public void addtest() 
 { 
   Connect c=new Connect();
    c.addtotable("insert into batchtestdetails values('t001','b200123')); 
} 
public void updatetest() 
 { 
 } 
   public void deletetest() 
  {
 } 
public void getalltest() 
 {
      ResultSet result=c.getresultset("select * from batchtestdetails"); 
      List<String> list=new ArrayList<String>();
    while(result.next()) 
 {   
  System.out.println(result.getString(1));
 }     
 } 

 } 