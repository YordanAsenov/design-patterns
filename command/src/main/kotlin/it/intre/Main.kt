package it.intre

import it.intre.counter.Command
import it.intre.counter.Counter
import it.intre.counter.IncreaseCommand
import it.intre.counter.NumericCounter
import it.intre.counter.button.Button

fun main() {
    val counter: Counter = NumericCounter()
    val increase: Command = IncreaseCommand(counter)

    val button = Button()
    button.setCommand(increase)
    println("Current value: " + counter.get())
    button.press()
    println("Current value: " + counter.get())
}
