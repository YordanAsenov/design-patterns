package it.intre.ducksApp.model

class RubberDuck: Duck() {
    override fun quack() {
        println("Squeak!")
    }

    override fun fly() {
        println("Can't fly!")
    }

    override fun display() {
        println("I'm a real Rubber duck")
    }
}