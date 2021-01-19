package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sample.MeiboBean;

public class rogin {
	
    // ���O�C���A�J�E���g��T��
    public  MeiboBean findAccount(MeiboBean ab) {
    	final String jdbcId ="root";
        final String jdbcPass ="ytyt0627";
        final String jdbcUrl = "jdbc:mysql://localhost:3306/sample?characterEncoding=UTF-8&serverTimezone=JST";

    	// �߂�l�̗p��
    	 MeiboBean returnAb = new MeiboBean();
    	// �f�[�^�x�[�X�֐ڑ�
    	 try (Connection con = DriverManager.getConnection(jdbcUrl, jdbcId, jdbcPass)) {
    		 String sql = "SELECT id, name, pass FROM user WHERE name = ? AND pass = ?;";
             PreparedStatement ps= con.prepareStatement(sql);
             
             ps.setString(1, ab.getName());
             ps.setString(2, ab.getpass());

             ResultSet rs = ps.executeQuery();
            
             if (rs.next()) {
                 // ���������A�J�E���g����߂�l�ɃZ�b�g
                 returnAb.setid(rs.getInt("id"));
                 returnAb.setname(rs.getString("name"));
                 returnAb.setpass(rs.getString("pass"));
             } else {
                 // �A�J�E���g���Ȃ����null��Ԃ�
                 return null;
             }
         } catch (SQLException e) {
             e.printStackTrace();
             return null;
         }
         return returnAb;
     }
    		 
    	 
    	 
    	
    }

