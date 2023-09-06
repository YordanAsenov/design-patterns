package it.intre

class Leaf(val name: String) : Node() {
    override fun accept(serializerVisitor: Visitor) : String{
        return serializerVisitor.doSomethingWithLeaf(this)
    }
}