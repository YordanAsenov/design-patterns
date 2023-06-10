package it.intre.ducksApp.behavior.quack

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}