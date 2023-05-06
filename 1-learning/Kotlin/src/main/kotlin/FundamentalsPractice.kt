fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    println(eveningNotification)

    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications")

    } else {
        println("Your phone is blowing up! You have 99+ notifications")
    }
}

class Song(
    private val title: String,
    private val artist: String,
    private val yearPublished: Int,
    private val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished")
    }
}
open class A{
    open fun print() {

    }
}

class B: A() {
    override fun print() {
        this.print()
    }
}