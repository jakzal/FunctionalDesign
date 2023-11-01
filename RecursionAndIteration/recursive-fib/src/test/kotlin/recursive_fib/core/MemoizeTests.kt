package recursive_fib.core

import mastermind.testkit.assertions.shouldReturn
import org.junit.jupiter.api.Test

class MemoizeTests {
    @Test
    fun `it returns a new function`() {
        val f = Memoize { a: Int -> "$a" }

        f(42) shouldReturn "42"
    }

    @Test
    fun `the new function only calculates value once for a given argument`() {
        val calledFor = mutableListOf<Int>()
        val f = Memoize { a: Int ->
            if (calledFor.contains(a)) {
                throw RuntimeException("Already calculated the result for $a. I should not be called again.")
            } else {
                calledFor.add(a)
            }
            "$a"
        }

        f(13) shouldReturn "13"
        f(42) shouldReturn "42"
        f(42) shouldReturn "42"
    }

    @Test
    fun `the new function only calculates value once for a given argument even null`() {
        val calledFor = mutableListOf<Int>()
        val f: (Int) -> String? = Memoize { a: Int ->
            if (calledFor.contains(a)) {
                throw RuntimeException("Already calculated the result for $a. I should not be called again.")
            } else {
                calledFor.add(a)
            }
            null
        }

        f(13) shouldReturn null
        f(42) shouldReturn null
        f(42) shouldReturn null
    }
}
