package otus.gbp.dependency

val carFactory = CarFactoryV4()

fun main() {
    val car = carFactory.buildCar()
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