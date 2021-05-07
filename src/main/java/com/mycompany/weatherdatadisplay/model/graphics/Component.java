package com.mycompany.weatherdatadisplay.model.graphics;

import org.jfree.chart.JFreeChart;

public abstract class Component {
    
    public abstract JFreeChart construct() throws Exception;
    
}
