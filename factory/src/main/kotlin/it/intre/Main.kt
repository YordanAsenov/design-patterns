package it.intre

import it.intre.client.NYPizzaStore

fun main() {
    val store = NYPizzaStore()
    val pizza = store.orderPizza("cheese")
    println("Ethan ordered a ${pizza.name}")
}
