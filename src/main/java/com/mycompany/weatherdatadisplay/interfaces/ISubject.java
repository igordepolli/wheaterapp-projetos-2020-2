package com.mycompany.weatherdatadisplay.interfaces;

import com.mycompany.weatherdatadisplay.interfaces.IObserver;

public interface ISubject {

    public void registerObserver(IObserver observer);

    public void removeObserver(IObserver observer);

    public void notifyObservers();

}
