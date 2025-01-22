package otus.gbp.dependency

class Engine(private val power: Int) {
    fun start() {
        println("Engine started with power $power")
    }
    fun stop() {
        println("Engine stopped")
    }
}