package it.intre.ducksApp.model

import it.intre.ducksApp.behavior.fly.FlyWithWings
import it.intre.ducksApp.behavior.quack.Quack

class MallardDuck: Duck(FlyWithWings(), Quack()) {
    override fun display() {
        println("I'm a real Mallard duck")
    }
}