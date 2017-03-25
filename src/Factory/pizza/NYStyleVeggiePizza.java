package Factory.pizza;

import Factory.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Veggie Sauce";

        toppings.add("Spinach");
    }
}
