package it.intre

import it.intre.ingredients.Cheese
import it.intre.ingredients.Dough
import it.intre.ingredients.Sauce

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
}