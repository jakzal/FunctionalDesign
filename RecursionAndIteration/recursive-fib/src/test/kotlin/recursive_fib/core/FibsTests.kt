package recursive_fib.core

import testkit.assertions.shouldReturn
import org.junit.jupiter.api.Test

class FibsTests {
    @Test
    fun `it works`() {
        fib(0) shouldReturn null
        fib(1) shouldReturn 1
        fib(2) shouldReturn 1
        fib(3) shouldReturn 2
        fib(4) shouldReturn 3
        fib(5) shouldReturn 5
        fibs(7) shouldReturn listOf(1, 1, 2, 3, 5, 8, 13)
        fib(0) shouldReturn null
        ifib(1) shouldReturn 1
        ifib(2) shouldReturn 1
        ifib(3) shouldReturn 2
        ifib(4) shouldReturn 3
        ifib(5) shouldReturn 5
    }
}
