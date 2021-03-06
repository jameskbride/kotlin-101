package com.jameskbride.kotlin.examples

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
object KotlinTypesSpec : Spek({
    describe("basic types") {
        it("has the usual types") {
            val doubleVal: Double = 64.0
            assertEquals(64.0, doubleVal, 0.001)

            val floatVal: Float = 32f
            assertEquals(32f, floatVal)

            val longVal: Long = 64L
            assertEquals(64L, longVal)

            val intVal: Int = 32
            assertEquals(32, intVal)

            val shortVal: Short = 16
            val otherShortVal: Short = 16
            assertEquals(otherShortVal, shortVal)

            val byteVal: Byte = 1
            val otherByteVal: Byte = 1
            assertEquals(otherByteVal, byteVal)
        }

        it("has Characters") {
            val char: Char = '\n'

            assertEquals('\n', char);
        }

        describe("strings") {
            it("has Strings") {
                val someString: String = "sasquatch"

                assertEquals("sasquatch", someString)
            }

            it("has 'raw' strings") {
                val aRawString: String = """
                    sasquatch
                """

                val anotherRawString: String = """
                    sasquatch
                """

                assertEquals(aRawString, anotherRawString)
            }

            it("has templating") {
                var sasquatchCount = 1
                var templatedString: String = "I see $sasquatchCount sasquatch"

                assertEquals("I see 1 sasquatch", templatedString)

                sasquatchCount = 2
                templatedString = "I see ${sasquatchCount} sasquatch"

                assertEquals("I see 2 sasquatch", templatedString)

            }
        }
    }
})
