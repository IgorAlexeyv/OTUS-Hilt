package otus.gbp.dependency

fun main() {
    val car = Car(V4Engine(200))
    car.start()
    car.stop()
}

class Car(private val engine: Engine) {
    fun start() {
        engine.start()
    }
    fun stop() {
        engine.stop()
    }
}