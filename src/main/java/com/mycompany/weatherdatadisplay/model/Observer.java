package com.mycompany.weatherdatadisplay.model;

import java.util.Date;

public interface Observer {
    
    public void update(Date date, Double temperature, Double humidity, Double pressure);
    
}
