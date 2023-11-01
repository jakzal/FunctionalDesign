package lazy_fib.core

import memoize.Memoize

fun fibw(n: Int) = when {
    n < 1 -> null
    n <= 2 -> 1
    else -> (fib(n - 1) ?: 0) + (fib(n - 2) ?: 0)
}

val fib: (Int) -> Int? = Memoize(::fibw)

fun lazyFibs() =
    generateSequence(1) {
        it + 1
    }.map {
        fib(it)
    }
