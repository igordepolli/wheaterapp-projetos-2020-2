package com.mycompany.weatherdatadisplay.model;

public abstract class Log {
    
    protected LogElementCollection logElements;
   
    public abstract void write() throws Exception;

}
