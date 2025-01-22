package otus.gbp.dependency

interface Engine {
    fun start()
    fun stop()
}

class V4Engine(private val power: Int) : Engine {
    override fun start() {
        println("V4 Engine started with power $power")
    }
    override fun stop() {
        println("Engine stopped")
    }
}

class V8Engine(private val power: Int) : Engine {
    override fun start() {
        println("V8 Engine started with power $power")
    }
    override fun stop() {
        println("Engine stopped")
    }
}