import java.sql.SQLException;
import java.util.List;
import view.HistogramDisplay;
import model.Histogram;
import model.Mail;
import view.MailHistogramBuilder;
import view.MailListReaderBD;

public class Kata5P2 {
    
    private static List<Mail> emailList;
    private static Histogram<String> histogram;
    
    public static void main(String[] args) throws SQLException {       
        input();   
    }
    
    public static void input() throws SQLException{
        process(MailListReaderBD.read());
    }
    
    public static void process(List<Mail> mailList){
        output(MailHistogramBuilder.build(mailList));
    }
    
    public static void output(Histogram<String> histogram){
        new HistogramDisplay(histogram).execute();
    }
    
}