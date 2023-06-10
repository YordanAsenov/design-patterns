package it.intre.ducksApp.behavior.fly

class FlyNoWay: FlyBehavior {
    override fun fly() {
        println("Can't fly!")
    }
}