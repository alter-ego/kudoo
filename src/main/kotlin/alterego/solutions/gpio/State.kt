package alterego.solutions.gpio

/**
 * Pin State. HIGH or LOW for digital ports. 0 to 255 for PWM ports.
 */
data class State(val value: Int) {

    private val MIN_VALUE = 0

    private val MAX_VALUE = 255

    companion object {

        private val serialVersionUID = 6764651533138982652L

        val HIGH = State(1)

        val LOW = State(0)
    }
}
