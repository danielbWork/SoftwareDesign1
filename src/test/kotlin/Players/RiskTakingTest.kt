package Players

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RiskTakingTest {
    val char = RiskTaking()
    @Test
    fun `char is named RiskTaking`() {
        assertEquals("RiskTaking", char.getName())
    }

}