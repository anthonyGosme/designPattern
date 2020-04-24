package com.gosme.design.pattern.strategy.impl;

import com.gosme.design.pattern.strategy.QuackBehavior;

public class Quack implements QuackBehavior {

  public void quack() {
    System.out.println("Quack");
  }
}
