package it.intre

import kotlin.text.StringBuilder

class XmlSerializerVisitor : Visitor() {
    private var result: StringBuilder = StringBuilder()

    override fun doSomethingWithComposite(composite: Composite) {
        result.append("<composite>")
        composite.children.forEach { it.accept(this) }
        result.append("</composite>")
    }

    override fun doSomethingWithLeaf(leaf: Leaf) {
        result.append("<leaf>${leaf.name}</leaf>")
    }

    override fun getResult(): String = result.toString()
}

