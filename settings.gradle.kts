rootProject.name = "functional-design"

pluginManagement {
    includeBuild("build-logic")
}

include("lib:assertions")
include("RecursionAndIteration:iterative-fib")
include("RecursionAndIteration:recursive-fib")
