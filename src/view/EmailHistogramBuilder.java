package view;

import java.util.List;
import model.Email;
import model.Histogram;

public class EmailHistogramBuilder {
    
    public static Histogram<String> createHistogram(List<Email> mail){
        Histogram<String> histo = new Histogram();
        for (Email mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
    
    
}
