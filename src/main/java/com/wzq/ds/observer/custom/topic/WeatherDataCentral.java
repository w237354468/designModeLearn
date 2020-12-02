package com.wzq.ds.observer.custom.topic;

import com.wzq.ds.observer.custom.obs.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataCentral implements Subject {

  private final List<Observer> observers;
  private float temp;
  private float humidity;
  private float pressure;

  public WeatherDataCentral() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    int i = observers.indexOf(observer);
    if (i > 0) {
      observers.remove(observer);
    }
  }

  @Override
  public void notifyObservers(float temp, float humidity, float pressure) {
    observers.forEach(observer -> observer.update(temp, humidity, pressure));
  }

  public void measurementsChange() {
    notifyObservers(temp, humidity, pressure);
  }

  public void setMeasurements(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChange();
  }

  // WeatherDataCentral的其他方法
}
