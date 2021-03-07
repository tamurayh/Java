package count;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class count {

	public count_list findAccount (count_list cl) {
		
		final String jdbcId ="root";
        final String jdbcPass ="nanami0522";
        final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";
        
	     // 戻り値の用意
	   	 count_list countall = new count_list();
	  // データベースへ接続
    	 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		 String sql = "SELECT count(*) FROM addition WHERE id = ?";
             PreparedStatement ps= con.prepareStatement(sql);
             
             ps.setInt(1, cl.getid());

             ResultSet rs = ps.executeQuery();
             
             if (rs.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_additionall(rs.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_additionall(rs.getInt(0));
             }
             
             String sql2 = "SELECT count(*) FROM addition WHERE id = ? AND Acceptance = 1";
             PreparedStatement ps2= con.prepareStatement(sql2);
             
             ps2.setInt(1, cl.getid());

             ResultSet rs2 = ps2.executeQuery();
             
             if (rs2.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_addition(rs2.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_addition(rs2.getInt(0));
             }
             
             String sql3 = "SELECT count(*) FROM subtraction WHERE id = ? ";
             PreparedStatement ps3= con.prepareStatement(sql3);
             
             ps3.setInt(1, cl.getid());

             ResultSet rs3 = ps3.executeQuery();
             
             if (rs3.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_subtractionall(rs3.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_subtractionall(rs3.getInt(0));
             }
             
             String sql4 = "SELECT count(*) FROM subtraction WHERE id = ? AND Acceptance = 1";
             PreparedStatement ps4= con.prepareStatement(sql4);
             
             ps4.setInt(1, cl.getid());

             ResultSet rs4 = ps4.executeQuery();
             
             if (rs4.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_subtraction(rs4.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_subtraction(rs4.getInt(0));
             }
             
             String sql5 = "SELECT count(*) FROM multiplication WHERE id = ? ";
             PreparedStatement ps5= con.prepareStatement(sql5);
             
             ps5.setInt(1, cl.getid());

             ResultSet rs5 = ps5.executeQuery();
             
             if (rs5.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_muitiplicationall(rs5.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_muitiplicationall(rs5.getInt(0));
             }
             
             String sql6 = "SELECT count(*) FROM multiplication WHERE id = ? AND Acceptance = 1 ";
             PreparedStatement ps6= con.prepareStatement(sql6);
             
             ps6.setInt(1, cl.getid());

             ResultSet rs6 = ps6.executeQuery();
             
             if (rs6.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_muitiplication(rs6.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_muitiplication(rs6.getInt(0));
             }
             String sql7 = "SELECT count(*) FROM divsion WHERE id = ?";
             PreparedStatement ps7 = con.prepareStatement(sql7);
             
             ps7.setInt(1, cl.getid());

             ResultSet rs7 = ps7.executeQuery();
             
             if (rs7.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_divsionall(rs7.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_divsionall(rs7.getInt(0));
             }
             
             String sql8 = "SELECT count(*) FROM divsion WHERE id = ? AND Acceptance = 1";
             PreparedStatement ps8 = con.prepareStatement(sql8);
             
             ps8.setInt(1, cl.getid());

             ResultSet rs8 = ps8.executeQuery();
             
             if (rs8.next()) {
                 // 見つかったアカウント情報を戻り値にセット
            	 countall.setcount_divsion(rs8.getInt("count(*)"));
            	 
             } else {
                 // アカウントがなければnullを返す
            	 countall.setcount_divsion(rs8.getInt(0));
             }
             
         } catch (SQLException e) {
             e.printStackTrace();
             return null;
         }
         return countall;
	}
}
