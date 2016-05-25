package alterego.solutions.pin

import alterego.solutions.gpio.Direction
import alterego.solutions.gpio.State
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

data class UdooNeoPin(val number: Int, val tag: String, val direction: Direction, val state: State) {

    init {
        println("Setting direction to ${direction} for pin ${number}")
        val directionPath = Paths.get("/gpio/pin${number}/direction")
        Files.write(directionPath, direction.name.toLowerCase().toByteArray(), StandardOpenOption.APPEND)

        println("Setting state to ${state} for pin ${number}")
        val path = Paths.get("/gpio/pin${number}/value")
        Files.write(path, state.value.toString().toByteArray(), StandardOpenOption.APPEND)
    }

    fun toggle(): UdooNeoPin {
        when (state) {
            State.HIGH -> return this.copy(state = State.LOW)
            State.LOW -> return this.copy(state = State.HIGH)
            else -> return this
        }
    }
}
