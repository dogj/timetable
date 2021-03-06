package TimeTable;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DBConnection {

	//connection
    private java.sql.Connection ct = null;  
    private java.sql.PreparedStatement ps = null;  
    private ResultSet rs = null;  
    private final String driver = "com.mysql.jdbc.Driver";  
    private final String url = "jdbc:mysql://localhost:3306/TimeTable";  
    private final String user = "root";  
    private final String passwd = "123"; 
    
    
    //query
       public ResultSet queryExecute(String sql, String s)  
    {  
        try {  
            
            Class.forName(driver);  
            
            ct = DriverManager.getConnection(url, user, passwd);  
              
            ps = ct.prepareStatement(sql);  
            
            ps.setString(1, s);
            
            rs = ps.executeQuery();  //execute
            
        } catch (Exception e) {  
            // TODO: handle exception  
            e.printStackTrace();  
      } //finally {  
//            close();  
//       }  
       
        return rs;  
    } 
       
       public ResultSet queryExecute(String sql, String s1, String s2)  
       {  
           try {  
               
               Class.forName(driver);  
               
               ct = DriverManager.getConnection(url, user, passwd);  
                 
               ps = ct.prepareStatement(sql);  
               
               ps.setString(1, s1);
               ps.setString(2, s2);
               
               rs = ps.executeQuery();  //execute
               
           } catch (Exception e) {  
               // TODO: handle exception  
               e.printStackTrace();  
         }           
           return rs;  
       } 
       

       public void close()  
    {  
        try {  
            if(rs!=null) rs.close();  
            if(ps!=null) ps.close();  
            if(ct!=null) ct.close();  
        } catch (Exception e2) {  
            // TODO: handle exception  
            e2.printStackTrace();  
        } 
    
     }
	
	
	
}
