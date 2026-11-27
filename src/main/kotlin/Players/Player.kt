package Players

import kotlin.math.min

class Player(private val name : String, val job : Job, val character: Character) {

    private var level : UInt
    private var coins : UInt
    private var force : UInt
    private val maxHealth : UInt
    private var currentHealth : UInt
    init {
        level = 1u
        coins = 10u + job.getStartingGoldBonus()
        force = 5u
        maxHealth = 100u + job.getStartingHPBonus()
        currentHealth = maxHealth
    }


    fun getDescription(): String = "$name, ${job.getName()} with ${character.getName()} (level " +
            "$level, force $force)"

    fun getName(): String = name//name

    fun getLevel(): UInt = level

    fun getForce(): UInt = force

    fun getHealthPoints(): UInt = currentHealth

    fun getCoins(): UInt = coins

    fun getCombatPower() = job.getCombatPower(force,level)

    /**
     * Increases the level to a maximum of 10
     */
    fun levelUp() {
        level = min(level +1u, 10u)
    }

    /**
     * Decreases coins to minimum of 0
     */
    fun loseCoins(c: UInt) {
        coins -= min(coins,c)
    }

    fun gainCoins(c:UInt){
        coins += c
    }

    /**
     * Decreases currentHealth to minimum of 0
     */
    fun loseHP(hp: UInt){
        currentHealth -= min(currentHealth,hp)
    }

    /**
     * Increases currentHealth to at most maxHealth
     */
    fun gainHP(hp: UInt){
        currentHealth = min(currentHealth + hp,maxHealth)
    }

    /**
     * Decreases force to minimum of 0
     */
    fun loseForce(f: UInt){
        force -= min(force,f);
    }

    fun gainForce(f: UInt){
        force += f;
    }





}
