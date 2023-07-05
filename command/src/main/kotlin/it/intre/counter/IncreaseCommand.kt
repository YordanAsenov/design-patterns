package it.intre.counter

class IncreaseCommand(private val counter: Counter): Command {
    private var lastValue: Int? = null

    override fun execute() {
        lastValue = counter.get()
        counter.increase()
    }

    override fun undo() {
        if(lastValue != null) {
            counter.set(lastValue!!)
        }
    }
}
