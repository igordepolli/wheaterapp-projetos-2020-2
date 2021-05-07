package com.mycompany.weatherdatadisplay.model.graphics.decorator;

import com.mycompany.weatherdatadisplay.model.graphics.Component;
import org.jfree.data.category.DefaultCategoryDataset;

public abstract class Chart extends Component {
    
    protected Component component;
    protected DefaultCategoryDataset defaultDataset;

    public Chart(DefaultCategoryDataset defaultDataset) {
        this.defaultDataset = defaultDataset;
    }
    
}