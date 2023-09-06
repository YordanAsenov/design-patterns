package it.intre

abstract class Shape {
    private var x: Int = 0
    private var y: Int = 0

    constructor(x: Int, y:Int){
        this.x = x
        this.y = y
        println("Shape constructor")
    }

    constructor(source: Shape) {
        x = source.x
        y = source.y
    }

    fun  getCoordinates ():List<Int>{
        return listOf(x,y)
    }

    abstract fun clone(): Shape

    abstract fun getArea(): Int
}