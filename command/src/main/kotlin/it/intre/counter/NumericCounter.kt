package it.intre.counter

class NumericCounter(private var value: Int = 0): Counter {
    override fun increase() {
        value++
    }

    override fun get(): Int {
        return value
    }
}
