/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAnomalies;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author HACKER
 */
public class bouncedLogInRate extends JPanel {

    public bouncedLogInRate() {
        setSize(700, 700);
        setLocation(0, 0);
        setBackground(Color.decode("#084061"));
        setLayout(null);
        
        add(getChartPanel());

    }

    public ChartPanel getChartPanel() {
        XYSeries series = new XYSeries("Annual Composite Production Vs Farmers Experience");
        series.add(0, 0);
        series.add(1, 100);
        series.add(2, 100);
        series.add(3, 100);
        series.add(4, 120);
        series.add(5, 120);
        series.add(6, 1040);
        series.add(7, 1040);
        series.add(8, 1040);
        series.add(9, 2000);
        series.add(10, 2000);
        series.add(11, 100);
        series.add(12, 100);
        series.add(13, 100);
        series.add(14, 120);
        series.add(15, 120);
        series.add(16, 1040);
        series.add(17, 1040);
        series.add(18, 1040);
        series.add(19, 2000);
        series.add(20, 2000);
        series.add(21, 1845);
        series.add(22, 1040);
        series.add(23, 2000);
       
// Add the series to your data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
// Generate the graph
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Sign-in Bounce off Rate", // Title
                "Time of Day", // x-axis Label
                "Number of Attempts", // y-axis Label
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Plot Orientation
                true, // Show Legend
                true, // Use tooltips
                false // Configure chart to generate URLs?
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBackground(Color.WHITE);
        chartPanel.setBounds(2, 5, 750, 500);
        chartPanel.setBorder(new LineBorder(Color.decode("#f5f5f5"), 2));

        return chartPanel;
    }

    public static final XYSeriesCollection getDataSet() {
        XYSeries series = new XYSeries("Sign-in Bounce off Rate");
        series.add(0, 0);
        series.add(1, 100);
        series.add(2, 100);
        series.add(3, 100);
        series.add(4, 120);
        series.add(5, 120);
        series.add(6, 1040);
        series.add(7, 1040);
        series.add(8, 1040);
        series.add(9, 2000);
        series.add(10, 2000);
// Add the series to your data set
        XYSeriesCollection dataset = new XYSeriesCollection();

        return dataset;
    }
}
