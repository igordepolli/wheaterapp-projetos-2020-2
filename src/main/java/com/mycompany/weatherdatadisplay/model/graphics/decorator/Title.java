package com.mycompany.weatherdatadisplay.model.graphics.decorator;

import com.mycompany.weatherdatadisplay.model.graphics.Component;
import org.jfree.chart.JFreeChart;

public class Title extends GraphicComponent {
    
    private final String title;

    public Title(String title, Component componentDecorated) {
        super(componentDecorated);
        this.title = title;
    }

    @Override
    public JFreeChart construct() throws Exception {
        JFreeChart chart = componentDecorated.construct();
        chart.setTitle(title);
        
        return chart;
    }
    
}
