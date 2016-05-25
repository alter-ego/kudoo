# Kudoo - Playground for UDOO Neo and Kotlin

## Basic GPIO manipulation

### Led setup

To turn ON a LED:

```kotlin
val pin = UdooNeoPin(33, "Led33", Direction.OUT, State.HIGH)
```

To turn OFF a LED:

```kotlin
val pin = UdooNeoPin(33, "Led33", Direction.OUT, State.LOW)
```
