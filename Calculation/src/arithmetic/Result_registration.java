package arithmetic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import userRegistration.MeiboBean;
import arithmetic.Randamu_sakusei;

public class Result_registration {
	
	final String jdbcId ="root";
    final String jdbcPass ="ytyt0627";
    final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";
    
    public Result_registration(Randamu_sakusei RS) {
    	
    	MeiboBean MB = new MeiboBean();
    	
    	try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		
    		String sql = "INSERT INTO addition (value1, value2, Answer, id) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, RS.getvalue1());
            ps.setInt(2, RS.getvalue2());
            ps.setInt(3, RS.getAnswer());
            ps.setInt(4, MB.getid());
            
            int r = ps.executeUpdate();
            
            if(r != 0) {
                System.out.println("“o˜^Š®—¹!");
            } else {
                System.out.println("“o˜^Ž¸”s");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
           
    		
    	}
    }

