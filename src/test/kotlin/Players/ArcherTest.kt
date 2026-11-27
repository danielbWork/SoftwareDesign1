package Players

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ArcherTest {
    val archer = Archer()

    @Test
    fun `combat power is force + level`() {
        assertEquals(20u, archer.getCombatPower(10u, 10u))
    }

    @Test
    fun `no starting hp bonus`() {
        assertEquals(0u, archer.getStartingHPBonus())

    }

    @Test
    fun `archer is Archer`() {
        assertEquals("Archer", archer.getName())
    }

    @Test
    fun `Starts with 10 gold bonus`() {
        assertEquals(10u, archer.getStartingGoldBonus())

    }

}