package arithmetic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Result_registrationsubtraction {
	
	final String jdbcId ="root";
    final String jdbcPass ="ytyt0627";
    final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";
    
    public Result_registrationsubtraction(Randamu_sakusei RS) {
    	
    	try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		
    		String sql = "INSERT INTO subtraction (value1, value2, Answer, Acceptance, id) VALUES (?, ?, ?, ?,?)";
            
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, RS.getvalue1());
            ps.setInt(2, RS.getvalue2());
            ps.setInt(3, RS.getAnswer());
            ps.setInt(4, RS.getAcceptance());
            ps.setInt(5, RS.getid());
            
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
