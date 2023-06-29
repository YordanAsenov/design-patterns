package it.intre.ingredients.chicago

import it.intre.PizzaIngredientFactory
import it.intre.ingredients.Cheese
import it.intre.ingredients.Dough
import it.intre.ingredients.Sauce

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ChicagoDough()
    }

    override fun createSauce(): Sauce {
        return ChicagoSauce()
    }

    override fun createCheese(): Cheese {
        return ChicagoCheese()
    }
}