package mastermind.testkit.assertions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.opentest4j.AssertionFailedError

class ShouldTests {
    @Test
    fun `shouldBe passes if two values are the same`() {
        "A" shouldBe "A"
    }

    @Test
    fun `shouldBe fails if two values are different`() {
        assertThrows<AssertionFailedError> {
            "A" shouldBe "B"
        }
    }

    @Test
    fun `shouldNotBe passes if two values are different`() {
        "A" shouldNotBe "B"
    }

    @Test
    fun `shouldNotBe fails if two values are the same`() {
        assertThrows<AssertionFailedError> {
            "A" shouldNotBe "A"
        }
    }

    @Test
    fun `shouldReturn passes if two values are the same`() {
        getMeA() shouldReturn "A"
    }

    @Test
    fun `shouldReturn fails if two values are different`() {
        assertThrows<AssertionFailedError> {
            getMeA() shouldReturn "B"
        }
    }

    @Test
    fun `shouldNotReturn passes if two values are the same`() {
        getMeA() shouldNotReturn "B"
    }

    @Test
    fun `shouldNotReturn fails if two values are different`() {
        assertThrows<AssertionFailedError> {
            getMeA() shouldNotReturn "A"
        }
    }

    @Test
    fun `shouldMatch passes if the regular expression evaluates to true`() {
        "aaa" shouldMatch "a{3}"
    }

    @Test
    fun `shouldMatch fails if the regular expression evaluates to false`() {
        assertThrows<AssertionFailedError> {
            "aaa" shouldMatch "a{5}"
        }
    }

    private fun getMeA() = "A"
}
