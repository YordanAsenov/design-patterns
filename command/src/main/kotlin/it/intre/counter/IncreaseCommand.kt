package it.intre.counter

class IncreaseCommand(private val counter: Counter): Command {
    override fun execute() {
        counter.increase()
    }
}
