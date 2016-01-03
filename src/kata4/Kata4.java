package kata4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Daniel
 */
public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       String name = "C:\\Users\\Daniel\\Desktop\\emailsfilev1.txt";
       ArrayList<String> listMail = MailList.read(name);
       Histogram<String> histogram = MailHistogramBuilder.build(listMail);
       HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
       histogramDisplay.execute();
    }
    
}
