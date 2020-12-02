package com.wzq.ds.observer.custom.topic;

import com.wzq.ds.observer.custom.obs.Observer;

public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(float temp, float humidity, float pressure);

}
