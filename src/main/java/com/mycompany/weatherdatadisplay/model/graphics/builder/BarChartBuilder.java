package com.mycompany.weatherdatadisplay.model.graphics.builder;

import com.mycompany.weatherdatadisplay.model.graphics.decorator.BarChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChartBuilder extends ChartBuilder {
    
    private final DefaultCategoryDataset defaultDataset;

    public BarChartBuilder(DefaultCategoryDataset defaultDataset) {
        this.defaultDataset = defaultDataset;
    }

    @Override
    public void createChart() {
        component = new BarChart(defaultDataset);
    }

    @Override
    public void insertCaption() {
    }

    @Override
    public void insertLabelData() {
    }

    @Override
    public void insertAxleTitle() {
    }

    @Override
    public void insertTitle() {
    }
    
}
