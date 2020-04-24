import com.gosme.design.pattern.strategy.Duck;
import com.gosme.design.pattern.strategy.breed.MallardDuck;
import com.gosme.design.pattern.strategy.breed.ModelDuck;
import com.gosme.design.pattern.strategy.impl.FlyRockerPowered;

public class DuckSimulator {

  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRockerPowered());
    model.performFly();
  }
}
