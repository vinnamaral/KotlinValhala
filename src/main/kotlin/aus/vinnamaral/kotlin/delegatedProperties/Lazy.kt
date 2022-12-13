package aus.vinnamaral.kotlin.delegatedProperties

/**
 * Lazy properties: the value is computed only on first access.
 *
 * lazy() is a function that takes a lambda and returns an instance of Lazy<T>, which can serve as a delegate for
 * implementing a lazy property. The first call to get() executes the lambda passed to lazy() and remembers the result.
 * Subsequent calls to get() simply return the remembered result.
 */

val lazyValue: String by lazy {
    println("computed")
    "Hello"
}

fun main() {
    println(lazyValue)
    println(lazyValue)
}