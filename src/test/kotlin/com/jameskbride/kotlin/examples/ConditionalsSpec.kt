package com.jameskbride.kotlin.examples

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.junit.Assert.assertEquals

@RunWith(JUnitPlatform::class)
object ConditionalsSpec : Spek({

    describe("if statement") {
        var max: Int? = 0
        val a: Int = 1
        val b: Int = 2

        it("can be used in standard form") {

            if (a < b) max = b

            assertEquals(2, max)

            if (a > b) {
                max = a
            } else {
                max = b
            }

            assertEquals(2, max)
        }

        it("is an expression which can return a value") {
            val max = if (a > b) a else b

            assertEquals(2, max)
        }
    }

    describe("when statement") {
        it("replaces the standard switch statement") {
            val x: Int = 1
            var y: Int
            when (x) {
                1 -> y = 3
                2 -> y = 4
                else -> y = 5
            }

            assertEquals(3, y)
        }

        it("is an expression which can return a value") {
            val x: Int = 1
            var y: Int = when (x) {
                1 -> 3
                2 -> 4
                else -> 5
            }

            assertEquals(3, y)
        }
    }
})