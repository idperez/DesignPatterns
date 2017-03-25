package Factory.stores;

import Factory.pizza.ChicagoStyleCheesePizza;
import Factory.pizza.ChicagoStyleVeggiePizza;
import Factory.Pizza;
import Factory.PizzaStore;

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
