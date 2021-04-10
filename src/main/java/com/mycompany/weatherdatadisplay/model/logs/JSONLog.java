package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.Log;
import java.util.ArrayList;

public class JSONLog extends Log {
    
    public JSONLog() {
        logCollectionList = new ArrayList<>();
    }
    
    @Override
    public void write(String message) {
        
    }

}
