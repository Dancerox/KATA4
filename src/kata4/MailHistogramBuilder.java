package kata4;
import java.util.ArrayList;
/**
 *
 * @author Daniel
 */
public class MailHistogramBuilder {

    public static Histogram<String> build (ArrayList<String> mailList){
        Histogram<String> histo = new Histogram<>();
        for (String mail : mailList) {
            Mail m = new Mail(mail);
            histo.increment(m.getDominio());
        }
        return histo;
    }
    
}
