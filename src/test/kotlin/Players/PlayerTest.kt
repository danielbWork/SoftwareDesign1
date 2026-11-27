package Players

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class PlayerTest {

    val warrior = Warrior()
    val archer = Archer()
    val magician = Magician()
    val riskTaking = RiskTaking()
    val responsible = Responsible()

    private lateinit var player: Player

    @Nested inner class `responsible magician checks`{
        @BeforeEach
        fun setUp() {
            player = Player("Bob",magician, responsible)
        }

        @Test
        fun `has valid description` (){
            assertEquals("Bob, Magician with Responsible (level " +
                    "1, force 5)", player.getDescription())
        }

        @Test
        fun `description updates force and level` (){
            player.levelUp()
            player.loseForce(1u)
            assertEquals("Bob, Magician with Responsible (level " +
                    "2, force 4)", player.getDescription())
        }

        @Test
        fun `Bob is named Bob`() {
            assertEquals("Bob", player.getName())
        }

        @Test
        fun `starting with level 1` (){
            assertEquals(1u, player.getLevel())
        }

        @Test
        fun `max level is 10` (){
            for (i in 1..100) {player.levelUp()}
            assertEquals(10u, player.getLevel())
        }

        @Test
        fun `starting with force 5` (){
            assertEquals(5u, player.getForce())
        }

        @Test
        fun `min force is 0` (){
            player.loseForce(100u)
            assertEquals(0u, player.getForce())
        }

        @Test
        fun `force increases by 100 after gain` (){
            player.gainForce(100u)
            assertEquals(105u, player.getForce())
        }

        @Test
        fun `starts with 100 HP`() {
            assertEquals(100u, player.getHealthPoints())
        }

        @Test
        fun `max 100 HP`() {
            player.gainHP(1000u)
            assertEquals(100u, player.getHealthPoints())
        }

        @Test
        fun `min 0 HP`() {
            player.loseHP(1000u)
            assertEquals(0u, player.getHealthPoints())
        }

        @Test
        fun `starts with 10 coins`() {
            assertEquals(10u, player.getCoins())
        }

        @Test
        fun `coins increases by 100 after gain` (){
            player.gainCoins(100u)
            assertEquals(110u, player.getCoins())
        }

        @Test
        fun `min 0 coin`() {
            player.loseCoins(1000u)
            assertEquals(0u, player.getCoins())
        }

        @Test
        fun `combat power is level + force`() {
            assertEquals(player.getCombatPower(), player.getForce() + player.getLevel())
        }
    }

    @Nested inner class `risk taking warrior`{
        @BeforeEach
        fun setUp() {
            player = Player("Floop",warrior, riskTaking)
        }

        @Test
        fun `has valid description` (){
            assertEquals("Floop, Warrior with RiskTaking (level " +
                    "1, force 5)", player.getDescription())
        }

        @Test
        fun `combat power is level + force mult 2`() {
            assertEquals(player.getCombatPower(), 2u*player.getForce() + player.getLevel())
        }

        @Test
        fun `starts with 150 HP`() {
            assertEquals(150u, player.getHealthPoints())
        }

    }

    @Nested inner class `risk taking archer` {
        @BeforeEach
        fun setUp() {
            player = Player("Glim", archer, riskTaking)
        }

        @Test
        fun `has valid description`() {
            assertEquals(
                "Glim, Archer with RiskTaking (level " +
                        "1, force 5)", player.getDescription()
            )
        }

        @Test
        fun `starts with 20 coins`() {
            assertEquals(20u, player.getCoins())
        }
    }

}