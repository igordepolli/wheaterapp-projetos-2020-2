package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.Log;
import java.util.ArrayList;

public class XMLLog extends Log {
    
    public XMLLog() {
        logCollectionList = new ArrayList<>();
    }
    
    @Override
    public void write(String message) {
        
    }

}
