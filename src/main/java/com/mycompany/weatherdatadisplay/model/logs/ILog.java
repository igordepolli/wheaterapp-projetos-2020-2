package com.mycompany.weatherdatadisplay.model.logs;

public interface ILog {
      
    public abstract void write(LogElement logElement) throws Exception;
    
}
