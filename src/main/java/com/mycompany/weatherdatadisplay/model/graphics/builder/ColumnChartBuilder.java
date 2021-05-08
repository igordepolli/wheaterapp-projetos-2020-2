package com.mycompany.weatherdatadisplay.model.graphics.builder;

import com.mycompany.weatherdatadisplay.model.graphics.decorator.ColumnChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class ColumnChartBuilder extends ChartBuilder {
    
    private final DefaultCategoryDataset defaultDataset;

    public ColumnChartBuilder(DefaultCategoryDataset defaultDataset) {
        this.defaultDataset = defaultDataset;
    }

    @Override
    public void createChart() {
        component = new ColumnChart(defaultDataset);
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
