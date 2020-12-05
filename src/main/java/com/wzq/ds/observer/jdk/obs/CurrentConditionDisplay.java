package com.wzq.ds.observer.jdk.obs;

import com.wzq.ds.observer.jdk.topic.WeatherDataCentral;

import java.util.Observable;
import java.util.Observer;
import java.util.StringJoiner;

public class CurrentConditionDisplay implements Observer, Display {

  private final Observable weatherDataCentral;
  private float temp;
  private float humidity;

  public CurrentConditionDisplay(Observable weatherDataCentral) {
    this.weatherDataCentral = weatherDataCentral;
    weatherDataCentral.addObserver(this);
  }

  @Override
  public void display() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", CurrentConditionDisplay.class.getSimpleName() + "[", "]")
        .add("temp=" + temp)
        .add("humidity=" + humidity)
        .toString();
  }

  @Override
  public void update(Observable o, Object arg) { // 可拉数据（去get），可推数据（arg），可以知道推送者（o）

    if (o instanceof WeatherDataCentral) {

      WeatherDataCentral dataCentral = (WeatherDataCentral) o;
      this.humidity = dataCentral.getHumidity();
      this.temp = dataCentral.getTemp();
      display();
    }
  }
}
