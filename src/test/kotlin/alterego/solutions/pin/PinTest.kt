package alterego.solutions.pin

import alterego.solutions.gpio.Direction
import alterego.solutions.gpio.State
import org.junit.Test
import kotlin.test.assertEquals

class PinTest {

    @Test
    fun toggle() {
        val pin = UdooNeoPin(25, "Led", Direction.OUT, State.HIGH)

        val toggled = pin.toggle()

        assertEquals(toggled.state, State.LOW)
    }
}
