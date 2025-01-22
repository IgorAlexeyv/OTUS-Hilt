package otus.gbp.dependency

fun main() {
    val car = Car()
    car.start()
    car.stop()
}

class Car {
    private val engine = Engine(100)

    fun start() {
        engine.start()
    }
    fun stop() {
        engine.stop()
    }
}