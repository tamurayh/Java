package Past_questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Past_questions_Addition_result {
	
	final String jdbcId ="root";
    final String jdbcPass ="nanami0522";
    final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";
    
    public Past_questions_Addition_result (Past_questions pq) {
    	
    	try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		
    		String sql = "UPDATE addition SET Answer = ? , Acceptance = ?  WHERE additionid = ?";
    		
    		PreparedStatement ps= con.prepareStatement(sql);
    		
       		ps.setInt(1, pq.getAnswer());
      		ps.setInt(2, pq.getAcceptance());
    		ps.setInt(3, pq.getadditionid());
    		
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
