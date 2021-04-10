package com.mycompany.weatherdatadisplay.model.logs;

import com.mycompany.weatherdatadisplay.model.logs.LogElement;
import java.util.ArrayList;
import java.util.List;

public class LogElementCollection {

    private static LogElementCollection instance = null;
    private final List<LogElement> logElements;

    private LogElementCollection() {
        logElements = new ArrayList<>();
    }

    public static LogElementCollection getInstance() {
        if (instance == null) {
            instance = new LogElementCollection();
        }
        return instance;
    }

    public void addLogElement(LogElement logElement) {
        logElements.add(logElement);
    }

    public boolean logElementsIsEmpty() {
        return logElements.isEmpty();
    }

    public List<LogElement> getLogElements() {
        return logElements;
    }

}
