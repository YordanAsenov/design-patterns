package it.intre

class XmlSerializerVisitor : Visitor() {
    override fun doSomethingWithComposite(composite: Composite) {
        println("<composite>")
        composite.children.forEach { it.accept(this) }
        println("</composite>")
    }

    override fun doSomethingWithLeaf(leaf: Leaf) {
        println("<leaf>${leaf.name}</leaf>")
    }
}