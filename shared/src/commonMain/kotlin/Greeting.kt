import kotlin.random.Random

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
       // return "Hello, ${platform.name}!"
        val firstWord = if (Random.nextBoolean()) "Hi" else "Hello"

        return  "$firstWord, guess what this is! > ${platform.name.reversed()} !"
    }
}