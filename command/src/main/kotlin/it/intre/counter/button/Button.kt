package it.intre.counter.button

import it.intre.counter.Command

class Button {
    private var lastExecutedCommand: Command? = null
    private var command: Command? = null

    fun setCommand(command: Command) {
        this.command = command
    }

    fun press() {
        this.command?.execute()
        lastExecutedCommand = this.command
    }

    fun undo(){
        lastExecutedCommand?.undo()
    }
}
