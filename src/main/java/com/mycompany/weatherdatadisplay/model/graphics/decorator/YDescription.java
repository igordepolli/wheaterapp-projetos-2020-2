package com.mycompany.weatherdatadisplay.model.graphics.decorator;

import com.mycompany.weatherdatadisplay.model.graphics.Component;
import org.jfree.chart.JFreeChart;

public class YDescription extends GraphicComponent {
    
    private final String description;

    public YDescription(String description, Component componentDecorated) {
        super(componentDecorated);
        this.description = description;
    }

    @Override
    public JFreeChart construct() throws Exception {
        JFreeChart chart = componentDecorated.construct();
        chart.getCategoryPlot().getRangeAxis().setLabel(description);
        
        return chart;
    }
    
}
