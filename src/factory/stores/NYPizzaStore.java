package factory.stores;


import factory.pizza.NYStyleCheesePizza;
import factory.pizza.NYStyleVeggiePizza;
import factory.Pizza;
import factory.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza;

        switch(type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            default:
                pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
