package Past_questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Past_questions_Addition {
	
	final String jdbcId ="root";
    final String jdbcPass ="nanami0522";
    final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";
    
    Past_questions Pqa = new Past_questions();
    
    public Past_questions  findAccount (Past_questions pq) {
    	
    	try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		
    		String sql = "SELECT * FROM addition WHERE id = ? AND Acceptance = 0 LIMIT 1 OFFSET ?";
            
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, pq.getid());
            ps.setInt(2, pq.getcount());
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // 見つかったアカウント情報を戻り値にセット
                Pqa.setpq_value1(rs.getInt("value1"));
                Pqa.setpq_value2(rs.getInt("value2"));
                Pqa.setadditionid(rs.getInt("additionid"));

            } else {
                
            	return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return Pqa;
    }
            
          
    }
