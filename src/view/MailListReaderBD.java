package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReaderBD {
    public static List<Mail> read(){
        List<Mail> list = new ArrayList<>();
        try (Connection conn = MailListReaderBD.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT Mail FROM EMAIL")){
            while(rs.next()){
                if(new Mail(rs.getString("Mail")).isEmail()){
                    list.add(new Mail(rs.getString("Mail")));
                }
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return list;
    }

   private static Connection connect() {
        String url = "jdbc:sqlite:KATA5.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(conn);
        return conn;
    }
}