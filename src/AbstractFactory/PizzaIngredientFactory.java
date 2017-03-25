package AbstractFactory;

public interface PizzaIngredientFactory {
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
