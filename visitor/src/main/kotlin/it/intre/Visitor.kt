package it.intre

abstract class Visitor {
    abstract fun doSomethingWithComposite(composite: Composite)
    abstract fun doSomethingWithLeaf(leaf: Leaf)
    abstract fun getResult(): String
}