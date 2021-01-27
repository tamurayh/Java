package userRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

import userRegistration.MeiboBean;

public class login {
	
    // ログインアカウントを探す
    public  MeiboBean findAccount(MeiboBean ab) {
    	final String jdbcId ="root";
        final String jdbcPass ="ytyt0627";
        final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";

    	// 戻り値の用意
    	 MeiboBean returnAb = new MeiboBean();
    	// データベースへ接続
    	 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		 String sql = "SELECT id, name, pass FROM user WHERE name = ?";
             PreparedStatement ps= con.prepareStatement(sql);
             
             ps.setString(1, ab.getname());

             ResultSet rs = ps.executeQuery();
             
             if (rs.next()) {
                 // 見つかったアカウント情報を戻り値にセット
                 returnAb.setid(rs.getInt("id"));
                 returnAb.setname(rs.getString("name"));
                 returnAb.setpass(rs.getString("pass"));
             } else {
                 // アカウントがなければnullを返す
                 return null;
             }
         } catch (SQLException e) {
             e.printStackTrace();
             return null;
         }
         return returnAb;
     }
    		 
    	 
    	 
    	
    }

