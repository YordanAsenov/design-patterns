package it.intre.counter

interface Command {
    fun execute()
    fun undo()
}
