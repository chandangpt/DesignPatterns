package com.chandan;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New york style cheese pizza");
        } /*else if(type.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New york style veggie pizza");
        } else if(type.equals("pepperoni")) {
            pizza = new PeppernoniPizza(pizzaIngredientFactory);
            pizza.setName("New york style pepperoni pizza");
        }*/
        return pizza;
    }
}
