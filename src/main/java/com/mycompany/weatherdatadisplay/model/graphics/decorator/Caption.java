package com.mycompany.weatherdatadisplay.model.graphics.decorator;

import com.mycompany.weatherdatadisplay.model.graphics.Component;
import org.jfree.chart.JFreeChart;

public class Caption extends GraphicComponent {
    
    private final boolean visibility;

    public Caption(boolean visibility, Component componentDecorated) {
        super(componentDecorated);
        this.visibility = visibility;
    }

    @Override
    public JFreeChart construct() throws Exception {
        JFreeChart chart = componentDecorated.construct();
        chart.getLegend().setVisible(visibility);
        
        return chart;
    }
    
}
