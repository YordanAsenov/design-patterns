package it.intre

class Rectangle : Shape {

    private var height: Int = 0
    private var width: Int = 0

    constructor(x: Int, y: Int, h: Int, w: Int) : super(x, y) {
        height = h
        width = w
    }

    constructor(rectangle: Rectangle) : super(rectangle) {
        height = rectangle.height
        width = rectangle.width
    }

    override fun getArea(): Int {
        return height * width
    }

    override fun clone(): Shape {
        return Rectangle(this)
    }
}