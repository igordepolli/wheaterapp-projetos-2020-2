package com.mycompany.weatherdatadisplay.model.logs;

public class ManagerLog {

    private ILog log;

    public ManagerLog(ILog log) throws Exception {
        this.log = log;
    }

    public void setLog(ILog log) {
        this.log = log;
    }

    public void write(LogElement logElement) throws Exception {
        this.log.write(logElement);
    }
}
