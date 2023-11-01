package iterative_fib.core

fun fibs(n: Int): List<Int> = when {
    n < 1 -> emptyList()
    n == 1 -> listOf(1)
    else -> fibsWork(n, 2, listOf(1, 1))
}

private tailrec fun fibsWork(n: Int, i: Int, fs: List<Int>): List<Int> = when {
    i == n -> fs
    else -> fibsWork(n, i + 1, fs + fs.takeLast(2).sum())
}

