package it.intre.pizzas

import it.intre.PizzaIngredientFactory

class CheesePizza(var ingredientFactory: PizzaIngredientFactory) : Pizza() {
    override fun prepare() {
        println("Preparing $name")
        name = "Cheese Pizza"
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}

