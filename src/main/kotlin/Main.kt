import java.io.IOException
import java.io.Reader
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.InvalidPathException
import kotlin.system.exitProcess

/** Opens both inputs before constructing the game, matching the supplied C++ entry point. */
fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Invalid number of arguments")
        println("Usage: MatamStory <events_file_path> <players_file_path>")
        exitProcess(1)
    }

    val status = try {
        openInput(args[0], "Invalid Events File").use { eventsReader ->
            openInput(args[1], "Invalid Players File").use { playersReader ->
                MatamStory(eventsReader, playersReader).play()
                0
            }
        }
    } catch (exception: Exception) {
        println(exception.message)
        1
    }
    exitProcess(status)
}

private fun openInput(path: String, errorMessage: String): Reader = try {
    Files.newBufferedReader(Path.of(path))
} catch (_: IOException) {
    throw IllegalArgumentException(errorMessage)
} catch (_: InvalidPathException) {
    throw IllegalArgumentException(errorMessage)
}
