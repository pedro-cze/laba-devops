package src.test

import sum
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumTest {

    @Test
    fun testSum() {
        val result = sum(2, 3)
        assertEquals(5, result)
    }
}