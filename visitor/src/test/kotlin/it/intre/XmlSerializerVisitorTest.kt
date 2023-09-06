package it.intre

import kotlin.test.assertEquals

class XmlSerializerVisitorTest {

    @org.junit.jupiter.api.Test
    fun testOneLeaf() {

        val leaf1 = Leaf("leaf1")

        val serializer = XmlSerializerVisitor()
        leaf1.accept(serializer)

        val result = serializer.getResult()

        // Assert
        val expected = "<leaf>leaf1</leaf>\n"

        assertEquals(expected, result)
    }

    @org.junit.jupiter.api.Test
    fun testComposite() {

        val leaf3 = Leaf("leaf3")
        val leaf4 = Leaf("leaf4")
        val composite1 = Composite(listOf(leaf3, leaf4))

        val serializer = XmlSerializerVisitor()
        composite1.accept(serializer)

        val result = serializer.getResult()

        // Assert
        val expected = """<composite>
            |	<leaf>leaf3</leaf>
            |	<leaf>leaf4</leaf>
            |</composite>
            |""".trimMargin()
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

        val serializer = XmlSerializerVisitor()
        listOf(leaf1, leaf2, composite2).forEach { it.accept(serializer) }

        val result = serializer.getResult()

        // Assert
        val expected =
            """<leaf>leaf1</leaf>
                |<leaf>leaf2</leaf>
                |<composite>
                |	<leaf>leaf5</leaf>
                |	<leaf>leaf6</leaf>
                |	<composite>
                |		<leaf>leaf3</leaf>
                |		<leaf>leaf4</leaf>
                |	</composite>
                |</composite>
                |""".trimMargin()
        assertEquals(expected, result)
    }
}