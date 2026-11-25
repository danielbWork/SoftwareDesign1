import Events.Event
import Players.Player

fun printStartMessage() {
    println("Game is about to start!")
    println("These are the players:")
    println()
}

/** Prints a player in the initial player list, with a one-based index. */
fun printStartPlayerEntry(index: Int, player: Player) {
    println("$index. ${player.getDescription()}")
}

fun printTurnDetails(index: Int, player: Player, event: Event) {
    println("Turn: $index")
    println("Player: ${player.getDescription()}")
    println("Event: ${event.getDescription()}")
}

fun printTurnOutcome(outcome: String) {
    println(outcome)
    println()
}

fun printRoundStart() {
    println("New round starts!")
    println()
}

fun printRoundEnd() {
    println("Round has ended!")
}

fun printLeaderBoardMessage() {
    println("Leader board is as follows:")
    println("Ranking    Player Name     Level     Force HP    Coins")
}

/** Prints one leaderboard row using the original column spacing. */
fun printLeaderBoardEntry(index: Int, player: Player) {
    print("$index          ")
    print(player.getName().padEnd(16))
    print(player.getLevel())
    if (player.getLevel() < 10) print(" ")
    print("        ")
    print(player.getForce().toString().padEnd(6))
    print(player.getHealthPoints().toString().padEnd(6))
    println(player.getCoins())
}

fun printBarrier() {
    println()
    println("----------------------------------------")
    println()
}

fun printGameOver() {
    println("Game is over!")
}

fun printWinner(player: Player) {
    println("The winner is: ${player.getName()}")
    println("Congratulations!")
    println()
}

fun printNoWinners() {
    println("There are no winners in this game.")
    println("Better luck next time!")
}

fun getEncounterWonMessage(player: Player, loot: Int): String =
    "${player.getName()} won the encounter, gained $loot coins and leveled up!"

fun getEncounterLostMessage(player: Player, damage: Int): String =
    "${player.getName()} lost the encounter and took $damage damage!"

fun getPotionsPurchaseMessage(player: Player, amount: Int): String =
    "${player.getName()} bought $amount potions!"

/** Returns the solar-eclipse outcome, including the actual force change when nonzero. */
fun getSolarEclipseMessage(player: Player, effect: Int): String {
    val message = "${player.getName()} was affected by a solar eclipse!"
    return if (effect != 0) {
        "$message their force has changed by $effect!"
    } else {
        "$message their force was not changed!"
    }
}
