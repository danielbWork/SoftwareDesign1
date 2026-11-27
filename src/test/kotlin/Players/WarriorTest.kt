package Players

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class WarriorTest {
    val warrior = Warrior()

    @Test
    fun `combat power is 2 mult force + level`() {
        assertEquals(30u, warrior.getCombatPower(10u, 10u))
    }

    @Test
    fun `50 starting hp bonus`() {
        assertEquals(50u, warrior.getStartingHPBonus())

    }

    @Test
    fun `warrior is named Warrior`() {
        assertEquals("Warrior", warrior.getName())
    }

    @Test
    fun `no gold bonus`() {
        assertEquals(0u, warrior.getStartingGoldBonus())

    }

}