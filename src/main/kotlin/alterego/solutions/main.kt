package alterego.solutions

import alterego.solutions.gpio.Direction
import alterego.solutions.gpio.State
import alterego.solutions.pin.UdooNeoPin

fun main(args: Array<String>) {
    println("Hello Udoo")

    val pin = UdooNeoPin(33, "Led33", Direction.OUT, State.HIGH)

    Thread.sleep(2000)

    val off = pin.toggle()
}
