package it.intre.pizzas

import it.intre.ingredients.Cheese
import it.intre.ingredients.Dough
import it.intre.ingredients.Sauce

abstract class Pizza {
    var name: String? = null
    var dough: Dough? = null
    var sauce: Sauce? = null
    var cheese: Cheese? = null
    abstract fun prepare()
    fun bake() {
        println("Bake for 25 minutes at 350")
    }

    fun cut() {
        println("Cutting the pizza into diagonal slices")
    }

    fun box() {
        println("Place pizza in official PizzaStore box")
    }

    override fun toString(): String {
        val result = StringBuffer()
        result.append("---- $name ----\n")
        if (dough != null) {
            result.append(dough)
            result.append("\n")
        }
        if (sauce != null) {
            result.append(sauce)
            result.append("\n")
        }
        if (cheese != null) {
            result.append(cheese)
            result.append("\n")
        }
        return result.toString()
    }
}
