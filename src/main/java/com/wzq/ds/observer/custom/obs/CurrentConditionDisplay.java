package com.wzq.ds.observer.custom.obs;

import com.wzq.ds.observer.custom.topic.Subject;

import java.util.StringJoiner;

public class CurrentConditionDisplay implements Display, Observer {

  private Subject weatherDataCentral;
  private float temp;
  private float humidity;
  private float pressure;

  public CurrentConditionDisplay(Subject weatherDataCentral) {
    this.weatherDataCentral = weatherDataCentral;
    weatherDataCentral.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println(toString());
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", CurrentConditionDisplay.class.getSimpleName() + "[", "]")
        .add("weatherDataCentral=" + weatherDataCentral)
        .add("temp=" + temp)
        .add("humidity=" + humidity)
        .add("pressure=" + pressure)
        .toString();
  }
}
