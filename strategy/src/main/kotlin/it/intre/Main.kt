package it.intre

import it.intre.ducksApp.behavior.fly.FlyRocketPowered
import it.intre.ducksApp.behavior.quack.MuteQuack
import it.intre.ducksApp.model.*

fun main() {
    println("Mallard duck: ")
    val mallardDuck: Duck = MallardDuck()
    mallardDuck.performQuack()
    mallardDuck.performFly()
    mallardDuck.swim()

    println("Redhead duck: ")
    val redheadDuck: Duck = RedheadDuck()
    redheadDuck.performQuack()
    redheadDuck.performFly()
    redheadDuck.swim()

    println("Rubber duck: ")
    val rubberDuck: Duck = RubberDuck()
    rubberDuck.performQuack()
    rubberDuck.performFly()
    rubberDuck.swim()

    println("Model duck: ")
    val modelDuck: Duck = ModelDuck()
    modelDuck.setQuackBehavior(MuteQuack())
    modelDuck.performQuack()
    modelDuck.performFly()
    modelDuck.setFlyBehavior(FlyRocketPowered())
    modelDuck.performFly()
}
