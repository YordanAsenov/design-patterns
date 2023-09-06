package it.intre

import kotlin.text.StringBuilder

class JsonSerializerVisitor : Visitor() {
    private var result: StringBuilder = StringBuilder()

    private var indent = 0

    override fun doSomethingWithComposite(composite: Composite) {
        result.appendLine("\t".repeat(indent) + "{ \"children\" : [")
        indent++
        composite.children.forEach {
            it.accept(this)
            if (composite.children.last() != it) {
                result.append(",")
            }
            result.appendLine()
        }
        indent--
        result.append("\t".repeat(indent) + "]}\n")
    }

    override fun doSomethingWithLeaf(leaf: Leaf) {
        result.append("\t".repeat(indent) + listOf("{ \"name\" : \"", leaf.name, "\" }").joinToString(""))
    }

    override fun getResult(): String = result.toString()
}

