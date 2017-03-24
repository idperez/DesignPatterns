import StrategyPattern.Ducks.Duck;
import StrategyPattern.Ducks.ModelDuck;
import StrategyPattern.Fly.FlyRocketPower;

public class Main {

    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPower());
        modelDuck.performFly();
    }
}
