# MatamStory Kotlin starter

See the official assignment for requirements and submission instructions.

## Open and build

Install JDK 21. Open this directory in IntelliJ IDEA as a Gradle project and select JDK 21 as the Gradle JVM. The Gradle wrapper supplies Gradle 8.10; the project uses Kotlin 2.0.21. The first build may need an internet connection to download dependencies.

From this directory on Windows PowerShell:

```powershell
.\gradlew.bat --no-daemon clean assemble
java -jar build/libs/MatamStory.jar tests/test1.events tests/test1.players
```

On Linux or macOS:

```sh
./gradlew --no-daemon clean assemble
java -jar build/libs/MatamStory.jar tests/test1.events tests/test1.players
```

If your ZIP extraction did not preserve executable permissions on Linux or macOS, run `chmod +x gradlew` first.

The build creates an executable `build/libs/MatamStory.jar` containing the Kotlin runtime. It runs directly with Java and does not need IntelliJ.

## Supplied files

```text
src/main/kotlin/
  Main.kt                Command-line arguments and file handling
  MatamStory.kt          Suggested implementation outline with TODOs
  Utilities.kt           Output functions and outcome messages
  Players/Player.kt      Player getter methods to implement
  Events/Event.kt        Event description method to implement
tests/
  test1.events / test1.players / test1.expected
  test2.events / test2.players / test2.expected
  test3.events / test3.players / test3.expected
```

