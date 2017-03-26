package abstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
