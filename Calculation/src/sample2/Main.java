package sample2;


import java.sql.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
      Connection con = null;
     	final String jdbcId ="root";
        final String jdbcPass ="ytyt0627";
        final String jdbcUrl  ="jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";

       try {
         con = DriverManager.getConnection(jdbcUrl,jdbcId,jdbcPass);
         Statement st = con.createStatement();
         String sql = "select * from user;";
         ResultSet result = st.executeQuery(sql);
 
         while(result.next()) {
           int id = result.getInt("id");
           String name = result.getString("name");
           System.out.println("id = " + id);
           System.out.println("name = " + name);
         }
       } catch (SQLException ex) {
         System.out.println("MySQLÇ÷ÇÃê⁄ë±Ç…é∏îsÇµÇ‹ÇµÇΩÅB");
       } finally {
         if(con != null) {
           con.close();
         }
       }
    }
}