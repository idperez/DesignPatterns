package Strategy.Ducks;
import Strategy.Fly.FlyNoWay;
import Strategy.Quack.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a model duck");
	}
}
