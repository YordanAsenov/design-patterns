package it.intre.pizzas

import it.intre.PizzaIngredientFactory

class PepperoniPizza(var ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("Preparing $name")
        name = "Pepperoni Pizza"
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}
