package mastermind.testkit.assertions

import org.junit.jupiter.api.Assertions.*

infix fun <T> T?.shouldBe(expected: T?) {
    assertEquals(expected, this, "$expected is $this")
}

infix fun <T> T?.shouldNotBe(expected: T?) {
    assertNotEquals(expected, this, "$expected is not $this")
}

infix fun String.shouldMatch(pattern: String) {
    assertTrue(pattern.toRegex().matches(this), "`$this` matches `$pattern`")
}

infix fun <T> T?.shouldReturn(expected: T?) = shouldBe(expected)

infix fun <T> T?.shouldNotReturn(expected: T?) = shouldNotBe(expected)
