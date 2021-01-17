package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sample.MeiboBean;

public class rogin {
	
	final String jdbcId = "root";
    final String jdbcPass = "ytyt0627";
    final String jdbcUrl = "jdbc:mysql://localhost/sample?characterEncoding=UTF-8&serverTimezone=JST";

    // ログインアカウントを探す
    public  MeiboBean findAccount(MeiboBean ab) {
    	
    	 MeiboBean returnAb = new MeiboBean();
    	 
    	 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		 String sql = "SELECT id, name, pass  FROM account WHERE id = ? AND pass = ?";
             PreparedStatement ps= con.prepareStatement(sql);

             ps.setInt(1, ab.getid());
             ps.setString(2, ab.getpass());

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

