package com.mycompany.weatherdatadisplay.model.graphics.builder;

import com.mycompany.weatherdatadisplay.model.graphics.Component;

public class ChartDirector {
    
    private final ChartBuilder builder;

    public ChartDirector(ChartBuilder builder) {
        this.builder = builder;
    }
    
    public Component buildGraphic() {
        builder.createChart();
        return builder.getComponent();
    }
}
