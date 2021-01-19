package sample;

import java.sql.*;

import sample.MeiboBean;

public class newuser {
	
	final String jdbcId ="root";
    final String jdbcPass ="ytyt0627";
    final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";
    
    public  newuser(MeiboBean ab) {
    
    try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    	Statement st = con.createStatement();
    	String sql1 = "SELECT COUNT(*) FROM user";
    	ResultSet ps1= st.executeQuery(sql1);
    	
    	ps1.next(); 
    	int ct = ps1.getInt("COUNT");
       	ct ++;

        String sql = "INSERT INTO user (id, name, pass) VALUES (?, ?, ?)";
        PreparedStatement ps= con.prepareStatement(sql);
        
        ps.setInt(1, ct);
        ps.setString(2, ab.getName());
        ps.setString(3, ab.getpass());
        
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
