package it.intre

import kotlin.text.StringBuilder

class XmlSerializerVisitor : Visitor() {
    private var result: StringBuilder = StringBuilder()

    private var indent = 0

    override fun doSomethingWithComposite(composite: Composite) {
        result.appendLine("\t".repeat(indent) + "<composite>")
        indent++
        composite.children.forEach { it.accept(this) }
        indent--
        result.appendLine("\t".repeat(indent) + "</composite>")
    }

    override fun doSomethingWithLeaf(leaf: Leaf) {
        result.appendLine("\t".repeat(indent) + listOf("<leaf>", leaf.name, "</leaf>").joinToString(""))
    }

    override fun getResult(): String = result.toString()
}

