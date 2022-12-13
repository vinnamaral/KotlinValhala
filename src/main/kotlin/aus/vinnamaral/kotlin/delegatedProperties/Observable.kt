package aus.vinnamaral.kotlin.delegatedProperties

import kotlin.properties.Delegates

/**
 * Observable properties: listeners are notified about changes to this property.
 *
 * Delegates.observable() takes two arguments: the initial value and a handler for modifications.
 *
 * The handler is called every time you assign to the property (after the assignment has been performed).
 * It has three parameters: the property being assigned to, the old value, and the new value.
 *
 * If you want to intercept assignments and veto them, use vetoable() instead of observable().
 * The handler passed to vetoable will be called before the assignment of a new property value.
 */

class User {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user = User()
    user.name = "first"
    user.name = "second"
    user.name = "third"
}