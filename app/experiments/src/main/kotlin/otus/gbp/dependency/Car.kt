package otus.gbp.dependency

fun main() {
    val car1 = Car(V4Engine(200))
    car1.start()
    car1.stop()

    val car2 = Car(V8Engine(400))
    car2.start()
    car2.stop()
}

class Car(private val engine: Engine) {
    fun start() {
        engine.start()
    }
    fun stop() {
        engine.stop()
    }
}