package otus.gbp.dependency

fun main() {
    // 2025 car factory - V4 engine
    val factory2025 = CarFactoryV4()
    buildWithFactory(factory2025)
    // 2026 car factory - V8 engine
    val factory2026 = CarFactoryV8()
    buildWithFactory(factory2026)
}

fun buildWithFactory(factory: CarFactory) {
    val car = factory.buildCar()
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