package it.intre.ducksApp.model

import it.intre.ducksApp.behavior.fly.FlyNoWay
import it.intre.ducksApp.behavior.quack.Squeak

class RubberDuck: Duck(FlyNoWay(), Squeak()) {
    override fun display() {
        println("I'm a real Rubber duck")
    }
}