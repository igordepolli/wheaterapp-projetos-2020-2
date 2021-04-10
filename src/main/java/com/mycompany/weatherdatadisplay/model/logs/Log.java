package com.mycompany.weatherdatadisplay.model.logs;

public abstract class Log {

    protected LogElementCollection logElements;

    public abstract void write() throws Exception;

}
