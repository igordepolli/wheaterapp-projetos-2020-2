package com.mycompany.weatherdatadisplay.model.graphics.decorator;

import com.mycompany.weatherdatadisplay.model.graphics.Component;

public abstract class GraphicComponent extends Component {
    
    protected Component componentDecorated;

    public GraphicComponent(Component componentDecorated) {
        this.componentDecorated = componentDecorated;
    }
    
}
