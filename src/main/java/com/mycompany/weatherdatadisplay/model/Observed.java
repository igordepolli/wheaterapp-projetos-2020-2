package com.mycompany.weatherdatadisplay.model;

public interface Observed {
    
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
