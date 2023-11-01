package lazy_fib.core

import org.junit.jupiter.api.Test
import testkit.assertions.shouldReturn

class FibsTests {
    @Test
    fun `it works`() {
        lazyFibs().take(6).toList() shouldReturn listOf(1, 1, 2, 3, 5, 8)
    }
}
