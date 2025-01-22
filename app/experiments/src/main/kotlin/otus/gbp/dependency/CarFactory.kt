package otus.gbp.dependency

interface CarFactory {
    fun buildCar(): Car
}

class CarFactoryV4 : CarFactory {
    override fun buildCar(): Car {
        return Car(V4Engine(200))
    }
}

class CarFactoryV8 : CarFactory {
    override fun buildCar(): Car {
        return Car(V8Engine(400))
    }
}

