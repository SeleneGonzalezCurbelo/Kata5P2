package view;

import java.util.List;
import model.Mail;
import model.Histogram;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram();
        mail.forEach((mail1) -> {
            histo.increment(mail1.getDomain());
        });
        return histo;
    }
    
    
}
