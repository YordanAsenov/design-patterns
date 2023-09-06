package it.intre

abstract class Node {
    abstract fun accept(serializerVisitor: Visitor)
}
