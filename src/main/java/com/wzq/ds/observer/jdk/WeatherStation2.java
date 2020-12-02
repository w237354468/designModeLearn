package com.wzq.ds.observer.jdk;

import com.wzq.ds.observer.jdk.obs.CurrentConditionDisplay;
import com.wzq.ds.observer.jdk.topic.WeatherDataCentral;

public class WeatherStation2 {

  public static void main(String[] args) {
    WeatherDataCentral dataCentral = new WeatherDataCentral();
    CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(dataCentral);
    while (true){
      try {
        Thread.sleep(2*1000);
        dataCentral.setMeasurements(1,2,1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
