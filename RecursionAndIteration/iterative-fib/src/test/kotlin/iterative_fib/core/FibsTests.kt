package iterative_fib.core

import mastermind.testkit.assertions.shouldReturn
import org.junit.jupiter.api.Test

class FibsTests {
    @Test
    fun `it works`() {
        fibs(1) shouldReturn listOf(1)
        fibs(2) shouldReturn listOf(1, 1)
        fibs(3) shouldReturn listOf(1, 1, 2)
        fibs(6) shouldReturn listOf(1, 1, 2, 3, 5, 8)
    }
}
