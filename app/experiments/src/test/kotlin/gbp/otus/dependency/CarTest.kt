package gbp.otus.dependency

import otus.gbp.dependency.Car
import otus.gbp.dependency.Engine
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CarTest {
    private val fakeEngine = object : Engine {
        var started = false

        override fun start() {
            started = true
        }
        override fun stop() {
            started = false
        }
    }

    @Test
    fun `should start engine`() {
        val car = Car(fakeEngine)
        car.start()
        assertTrue { fakeEngine.started }
    }

    @Test
    fun `should stop engine`() {
        val car = Car(fakeEngine)
        car.start()
        car.stop()
        assertFalse { fakeEngine.started }
    }
}