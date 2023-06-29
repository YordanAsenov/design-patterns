package it.intre.client

import it.intre.pizzas.PepperoniPizza
import it.intre.pizzas.Pizza
import it.intre.ingredients.ny.NYPizzaIngredientFactory
import it.intre.pizzas.CheesePizza
import it.intre.pizzas.PizzaStore

class NYPizzaStore : PizzaStore() {
    override fun createPizza(item: String?): Pizza {
        val factory = NYPizzaIngredientFactory()
        return when (item) {
            "cheese" -> {
                CheesePizza(factory)
            }

            "pepperoni" -> {
                PepperoniPizza(factory)
            }

            else -> PepperoniPizza(factory)
        }
    }
}