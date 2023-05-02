import jdk.jfr.Category

class SmartDevice(val name: String, val category: String) {
//    val name = "Android TV"
//    val category = "Entertainment"
    var deviceStatus = "offline"

    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun turnOn() {
        println("Smart device is turned on.")
        deviceStatus = "online"
    }

    fun turnOff() {
        println("Smart device is turned off.")
        deviceStatus = "offline"
    }
}

fun main() {
    val device = SmartDevice(name = "Android TV", category = "Entertainment")
    device.turnOn()
    device.turnOff()
}