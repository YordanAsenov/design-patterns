package it.intre

import kotlin.test.assertEquals

class JsonSerializerVisitorTest {

    @org.junit.jupiter.api.Test
    fun testOneLeaf() {

        val leaf1 = Leaf("leaf1")

        val serializer = JsonSerializerVisitor()
        leaf1.accept(serializer)

        val result = serializer.getResult()

        // Assert
        val expected = """{ "name" : "leaf1" }""".trimMargin()

        assertEquals(expected, result)
    }

    @org.junit.jupiter.api.Test
    fun testComposite() {

        val leaf3 = Leaf("leaf3")
        val leaf4 = Leaf("leaf4")
        val composite1 = Composite(listOf(leaf3, leaf4))

        val serializer = JsonSerializerVisitor()
        composite1.accept(serializer)

        val result = serializer.getResult()

        // Assert
        val expected = """{ "children" : [
            |	{ "name" : "leaf3" },
            |	{ "name" : "leaf4" }
            |]}""".trimMargin()
        assertEquals(expected, result)
    }

    @org.junit.jupiter.api.Test
    fun testComplexComposite() {

        val leaf1 = Leaf("leaf1")
        val leaf2 = Leaf("leaf2")
        val leaf3 = Leaf("leaf3")
        val leaf4 = Leaf("leaf4")
        val leaf5 = Leaf("leaf5")
        val leaf6 = Leaf("leaf6")
        val composite1 = Composite(listOf(leaf3, leaf4))
        val composite2 = Composite(listOf(leaf5, leaf6, composite1))

        val serializer = JsonSerializerVisitor()
        Composite(listOf(leaf1, leaf2, composite2)).accept(serializer)

        val result = serializer.getResult()

        // Assert
        val expected = """{ "children" : [
            |	{ "name" : "leaf1" },
            |	{ "name" : "leaf2" },
            |	{ "children" : [
            |		{ "name" : "leaf5" },
            |		{ "name" : "leaf6" },
            |		{ "children" : [
            |			{ "name" : "leaf3" },
            |			{ "name" : "leaf4" }
            |		]}
            |	]}
            |]}""".trimMargin()
        assertEquals(expected, result)
    }
}