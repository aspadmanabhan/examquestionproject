 package exam;
import java.sql.*;
public class Connect
 { 
  Connection con;
  Statement stat;
  ResultSet result;
  
   Connect() 
 {
  try
 { 
   
   Class.forName("org.h2.Driver");
   con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/weektest","sa","");y
  stat=con.createStatement();
  
 } 
  catch(Exception e)
  { 
 }    
 }  
   
   public ResultSet getResultSet(String query)
 { 
   result=stat.execute.Query(query);
   return result;
 }

   public int addtotable(String query)
 { 
  return stat.executeUpdate(query);
 }  
 } 


 