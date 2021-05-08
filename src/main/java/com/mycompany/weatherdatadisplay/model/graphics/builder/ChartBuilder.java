package com.mycompany.weatherdatadisplay.model.graphics.builder;

import com.mycompany.weatherdatadisplay.model.graphics.Component;

public abstract class ChartBuilder {
    
    protected Component component;

    public ChartBuilder() {
    }
    
    public abstract void createChart();
    
    public abstract void insertCaption();
    
    public abstract void insertLabelData();
    
    public abstract void insertAxleTitle();
    
    public abstract void insertTitle();
    
    public Component getComponent() {
        return component;
    }
}
