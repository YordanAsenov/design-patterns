package it.intre

import kotlin.test.assertEquals

class RectangleTest {

    @org.junit.jupiter.api.Test
    fun getArea() {
        // Arrange
        val myRec = Rectangle(1, 2, 3, 4)
        // Act & Assert
        assertEquals(12, myRec.getArea())
    }

    @org.junit.jupiter.api.Test
    fun testClone() {

        // Arrange
        val myRec = Rectangle(1, 2, 3, 4)
        // Act
        val clone = myRec.clone()
        // Assert
        assertEquals(12, clone.getArea())
        assertEquals(listOf(1, 2), clone.getCoordinates())
    }
}