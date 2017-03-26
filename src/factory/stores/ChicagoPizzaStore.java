package factory.stores;

import factory.pizza.ChicagoStyleCheesePizza;
import factory.pizza.ChicagoStyleVeggiePizza;
import factory.Pizza;
import factory.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza;

        switch(type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
