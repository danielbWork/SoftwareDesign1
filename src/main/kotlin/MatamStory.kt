import Players.Player
import java.io.Reader

class MatamStory(eventsReader: Reader, playersReader: Reader) {
    private var turnIndex: Int = 1

    init {
        // TODO: Read and validate all events from eventsReader.
        // TODO: Read and validate all players from playersReader.
        // Add the state needed by your design.
    }

    private fun playTurn(player: Player) {
        // TODO:
        // 1. Get the next event from the events list.
        // 2. Print the turn details using printTurnDetails.
        // 3. Play the event.
        // 4. Print the turn outcome using printTurnOutcome.
        turnIndex++
    }

    private fun playRound() {
        printRoundStart()
        // TODO: Play a turn for each active player.
        printRoundEnd()
        printLeaderBoardMessage()
        // TODO: Print each leaderboard entry using printLeaderBoardEntry.
        printBarrier()
    }

    private fun isGameOver(): Boolean = TODO("Implement the game over condition")

    /** Plays the entire game. The provided flow is a suggested implementation outline. */
    fun play() {
        printStartMessage()
        // TODO: Print each player using printStartPlayerEntry, in input order.
        printBarrier()

        while (!isGameOver()) {
            playRound()
        }

        printGameOver()
        // TODO: Print either the winner using printWinner or no winner using printNoWinners.
    }
}
