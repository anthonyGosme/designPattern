package com.gosme.design.pattern.strategy.breed;

import com.gosme.design.pattern.strategy.Duck;
import com.gosme.design.pattern.strategy.impl.FlyNoWay;
import com.gosme.design.pattern.strategy.impl.Quack;

public class ModelDuck extends Duck {
  public ModelDuck() {
    super.setFlyBehavior(new FlyNoWay());
    super.setQuackBehavior(new Quack());
  }
}
