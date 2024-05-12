import kotlin.random.Random

class Greeting {
    private val platform = getPlatform()

    /*fun greet(): String {
       // return "Hello, ${platform.name}!"
        val firstWord = if (Random.nextBoolean()) "Hi" else "Hello"

        return  "$firstWord, guess what this is! > ${platform.name.reversed()} !"
    }*/

    fun greet():List<String> = buildList{
        add(if (Random.nextBoolean()) "HI" else "Hello")
        add("Guess what this is! > ${platform.name.reversed()} !" )
    }
}