package it.intre.ducksApp.model

import it.intre.ducksApp.behavior.fly.FlyBehavior
import it.intre.ducksApp.behavior.quack.QuackBehavior

abstract class Duck {
    private var flyBehavior: FlyBehavior? = null
    private var quackBehavior: QuackBehavior? = null

    constructor()

    constructor(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) {
        this.flyBehavior = flyBehavior
        this.quackBehavior = quackBehavior
    }

    fun performFly() {
        this.flyBehavior?.fly()
    }

    fun performQuack() {
        this.quackBehavior?.quack()
    }

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this.flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()
}
