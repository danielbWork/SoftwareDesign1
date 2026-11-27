package Players

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MagicianTest {
    val magician = Magician()

    @Test
    fun `combat power is force + level`() {
        assertEquals(20u, magician.getCombatPower(10u, 10u))
    }

    @Test
    fun `no starting hp bonus`() {
        assertEquals(0u, magician.getStartingHPBonus())

    }

    @Test
    fun `magician is named Magician`() {
        assertEquals("Magician", magician.getName())
    }

    @Test
    fun `no gold bonus`() {
        assertEquals(0u, magician.getStartingGoldBonus())

    }

}