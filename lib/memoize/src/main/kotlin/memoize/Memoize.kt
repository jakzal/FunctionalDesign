package memoize

class Memoize<IN, OUT>(
    private val f: (IN) -> OUT
) : (IN) -> OUT {
    private val memory = mutableMapOf<IN, OUT>()

    @Suppress("UNCHECKED_CAST")
    override fun invoke(i: IN): OUT =
        (if (memory.containsKey(i)) memory[i] as OUT
        else f(i).also { memory[i] = it })
}
