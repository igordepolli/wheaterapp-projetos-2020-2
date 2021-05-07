package com.mycompany.weatherdatadisplay.model.graphics.decorator;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class ColumnChart extends Chart {

    public ColumnChart(DefaultCategoryDataset defaultDataset) {
        super(defaultDataset);
    }

    @Override
    public JFreeChart construct() throws Exception {
        JFreeChart chart = createBarChart(defaultDataset);
        return chart;
    }
    
    private JFreeChart createBarChart(CategoryDataset defaultDataset) {
        JFreeChart chart = ChartFactory.createBarChart("", "", "", defaultDataset, PlotOrientation.VERTICAL, true, false, false);
        return chart;
    }
    
}
