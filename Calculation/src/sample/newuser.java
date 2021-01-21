package sample;

import java.sql.*;
import org.mindrot.jbcrypt.BCrypt;

import sample.MeiboBean;

public class newuser {
		
	final String jdbcId ="root";
    final String jdbcPass ="ytyt0627";
    final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";
    
    String Password = null;
    
    public  newuser(MeiboBean ab) {

    
    try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {

        String sql = "INSERT INTO user (name, pass) VALUES (?, ?)";
        PreparedStatement ps= con.prepareStatement(sql);
        
        String hashed = BCrypt.hashpw(ab.getpass(),BCrypt.gensalt());
        
        ps.setString(1, ab.getName());
        ps.setString(2, hashed);
        
        int r = ps.executeUpdate();

        if(r != 0) {
            System.out.println("êVãKìoò^ê¨å˜ÅI");
        } else {
            System.out.println("êVãKìoò^é∏îs");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}
