package com.gosme.design.pattern.strategy.impl;

import com.gosme.design.pattern.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {

  public void quack() {
    System.out.println("<< Silence >>");
  }
}
