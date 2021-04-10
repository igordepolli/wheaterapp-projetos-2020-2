package com.mycompany.weatherdatadisplay.model;

import java.util.List;

public abstract class Log {
    
    protected List<LogCollection> logCollectionList;
   
    public abstract void write();

}
