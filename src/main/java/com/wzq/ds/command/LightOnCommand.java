package com.wzq.ds.command;

public class LightOnCommand implements Command {

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}

class Light {

  public void on() {
    System.out.println("light on ");
  }
}
