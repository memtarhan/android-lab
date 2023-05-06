fun main() {
    // Store a function in a variable
    val trickFunction = ::trick
    trick()
    trickFunction()

    // Store a lambda in a variable
    val trickFunction2 = trick2
    trick2()
    trickFunction2()

    // Use functions as a data type
    val treatFunction = trickOrTreat(false)
    val trickFunction3 = trickOrTreat(true)

    treatFunction()
    trickFunction3()

    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction2 = trickOrTreat2(false, coins)
    val trickFunction4 = trickOrTreat2(true, cupcake)

    treatFunction2()
    trickFunction4()

    // Omit parameter names
    val coins2: (Int) -> String = { quantity ->
        "$quantity quarters"
    }
    val coins3: (Int) -> String = {
        "$it quarters"
    }

    val treatFunction3 = trickOrTreat2(false) { "$it quarters" }

    repeat(3) {
        treatFunction()
    }
}


fun trick() {
    println("No treats!")
}

// Function with lambda expression
val trick2 = {
    println("2 No treats!")
}

val treat = {
    println("Have a treat!")
}

val treat2: () -> Unit = {
    println("Have a treat!")
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick2

    } else {
        return treat
    }
}

fun trickOrTreat2(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick2

    } else {
        println(extraTreat(5))
        return treat
    }
}

/*
Summary

*   Functions in Kotlin are first-class constructs and can be treated like data types.
*   Lambda expressions provide a shorthand syntax to write functions.
*   You can pass function types into other functions.
*   You can return a function type from another function.
*   A lambda expression returns the value of the last expression.
*   If a parameter label is omitted in a lambda expression with a single parameter, it's referred to with the it identifier.
*   Lambdas can be written inline without a variable name.
*   If a function's last parameter is a function type, you can use trailing lambda syntax to move the lambda expression after the last parenthesis when you call a function.
*   Higher-order functions are functions that take other functions as parameters or return a function.
*   The repeat() function is a higher-order function that works similarly to a for loop.

 */