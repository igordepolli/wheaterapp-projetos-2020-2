package com.mycompany.weatherdatadisplay.model;

public interface ISubject {
    
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
    
}
