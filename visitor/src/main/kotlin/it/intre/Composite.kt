package it.intre

class Composite(val children: List<Node>) : Node() {
    override fun accept(serializerVisitor: Visitor) {
        serializerVisitor.doSomethingWithComposite(this)
    }
}