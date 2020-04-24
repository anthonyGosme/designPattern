package com.gosme.design.pattern.strategy.breed;

import com.gosme.design.pattern.strategy.impl.FlyWithWings;
import com.gosme.design.pattern.strategy.impl.Quack;
import com.gosme.design.pattern.strategy.Duck;

public class MallardDuck extends Duck {
  public MallardDuck() {
    // colvert
    super.setFlyBehavior(new FlyWithWings());
    super.setQuackBehavior(new Quack());
  }
}
