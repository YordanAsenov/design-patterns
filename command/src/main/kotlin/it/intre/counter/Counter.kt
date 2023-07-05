package it.intre.counter

interface Counter {
    fun increase()
    fun get(): Int
    fun set(value: Int)
}
