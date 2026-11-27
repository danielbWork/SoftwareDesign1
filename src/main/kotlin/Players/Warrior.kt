package Players

class Warrior : Job {

    override fun getName(): String = "Warrior"

    override fun getCombatPower(force: UInt, level: UInt) =  (force*2u) + level


    override fun getStartingHPBonus() = 50u
}