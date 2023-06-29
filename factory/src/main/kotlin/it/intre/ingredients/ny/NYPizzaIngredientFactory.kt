package it.intre.ingredients.ny

import it.intre.PizzaIngredientFactory
import it.intre.ingredients.Cheese
import it.intre.ingredients.Dough
import it.intre.ingredients.Sauce

class NYPizzaIngredientFactory :PizzaIngredientFactory {
    override fun createDough(): Dough {
        return NYDough()
    }

    override fun createSauce(): Sauce {
        return NYSauce()
    }

    override fun createCheese(): Cheese {
        return NYCheese()
    }
}