package com.gosme.design.pattern.strategy.impl;

import com.gosme.design.pattern.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
  public void fly() {
    System.out.println("I'm flying !!");
  }
}
