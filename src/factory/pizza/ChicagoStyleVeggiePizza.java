package factory.pizza;

import factory.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Veggie Sauce";

        toppings.add("Extra Spinach");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
