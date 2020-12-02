package com.wzq.ds.observer.custom;

import com.wzq.ds.observer.custom.obs.CurrentConditionDisplay;
import com.wzq.ds.observer.custom.topic.WeatherDataCentral;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherDataCentral dataCentral = new WeatherDataCentral();
    CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(dataCentral);

    while (true) {
      try {
        Thread.sleep(2 * 1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      dataCentral.setMeasurements(1, 2, 3);
    }
  }
}
