package Factory.stores;


import Factory.pizza.NYStyleCheesePizza;
import Factory.pizza.NYStyleVeggiePizza;
import Factory.Pizza;
import Factory.PizzaStore;

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
