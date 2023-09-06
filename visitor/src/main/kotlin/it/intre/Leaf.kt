package it.intre

class Leaf(val name: String) : Node() {
    override fun accept(serializerVisitor: Visitor) {
        serializerVisitor.doSomethingWithLeaf(this)
    }
}