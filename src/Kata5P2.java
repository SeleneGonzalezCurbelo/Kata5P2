import java.util.List;
import model.Email;
import view.HistogramDisplay;
import model.Histogram;
import view.EmailHistogramBuilder;
import view.EmailReader;

public class Kata5P2 {
    
    private static List<Email> emailList;
    private static Histogram<String> histogram;
    
    public static void main(String[] args) {
        String fileName = "email.txt";
        emailList = EmailReader.read(fileName); 
        histogram = EmailHistogramBuilder.createHistogram(emailList);
        new HistogramDisplay(histogram).execute();        
    }
    
}