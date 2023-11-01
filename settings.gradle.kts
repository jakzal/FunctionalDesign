rootProject.name = "functional-design"

pluginManagement {
    includeBuild("build-logic")
}

include("lib:assertions")
include("lib:memoize")

include("RecursionAndIteration:iterative-fib")
include("RecursionAndIteration:recursive-fib")
include("Laziness:lazy-fib")
