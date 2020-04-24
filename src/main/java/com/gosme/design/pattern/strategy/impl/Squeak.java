package com.gosme.design.pattern.strategy.impl;

import com.gosme.design.pattern.strategy.QuackBehavior;

public class Squeak implements QuackBehavior {

  public void quack() {
    System.out.println("Squeak");
  }
}
