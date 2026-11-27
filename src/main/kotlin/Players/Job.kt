package Players

interface Job {

    fun getName(): String
    fun getCombatPower(force : UInt, level : UInt) : UInt = force + level
    fun getStartingHPBonus() : UInt = 0u
    fun getStartingGoldBonus() : UInt = 0u

}