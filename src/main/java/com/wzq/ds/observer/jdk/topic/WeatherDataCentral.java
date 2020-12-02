package com.wzq.ds.observer.jdk.topic;

import java.util.Observable;

public class WeatherDataCentral extends Observable {

  private float temp;
  private float humidity;
  private float pressure;

  public WeatherDataCentral() {}

  public void measurementsChange() {
    setChanged(); //用来标记是否可以开始通知，比如温度频繁变化时，不想实时通知，可以用这个属性控制时机
    notifyObservers(getTemp());
  }

  public void setMeasurements(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChange();
  }

  public float getTemp() {
    return temp;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
