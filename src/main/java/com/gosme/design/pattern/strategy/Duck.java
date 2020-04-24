package com.gosme.design.pattern.strategy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {}

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }
}
