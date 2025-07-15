package src.test

import sum
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class SumTest {

    @Test
    fun testSum() {
        val result = sum(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun testSum2() {
        val result = sum(2, 3)
        assertFalse(result != 5)
    }
}