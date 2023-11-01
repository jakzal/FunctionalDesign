package recursive_fib.core

fun fibw(n: Int): Int? = when {
    n < 1 -> null
    n <= 2 -> 1
    else -> (fib(n - 1) ?: 0) + (fib(n - 2) ?: 0)
}

val fib: (Int) -> Int? = Memoize(::fibw)

fun fibs(n: Int): List<Int> = (1..n).map {
    fib(it) ?: 0
}

fun ifib(n: Int, a: Int, b: Int): Int? = when {
    n == 0 -> b
    else -> ifib(n - 1, b, a + b)
}

fun ifib(n: Int): Int? = when {
    n < 1 -> null
    n <= 2 -> 1
    else -> ifib(n - 2, 1, 1)
}
