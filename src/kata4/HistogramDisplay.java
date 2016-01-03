package kata4;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
/**
 *
 * @author Daniel
 */
public class HistogramDisplay extends ApplicationFrame {
    
    private final Histogram<String> histograma;
    
    public HistogramDisplay(Histogram<String> histograma){
        super("Histograma");
        this.histograma = histograma;
        setContentPane(createpanel());
        pack();
    }
    
    private ChartPanel createpanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart (DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart(null,
                "DOMINIO",
                "Nº email",
                dataset,
                PlotOrientation.VERTICAL,
                true, 
                true, 
                false); 
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (String key: histograma.keySet()){
        dataset.addValue(histograma.get(key),"",key);
        }
        
        return dataset;
    }
    
    public void execute(){
        setVisible(true);
    }
    
}
