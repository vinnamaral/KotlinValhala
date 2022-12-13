package aus.vinnamaral.kotlin.propertyDelegation

import kotlin.reflect.KProperty

/**
 * The syntax is: val/var <property name>: <Type> by <expression>. The expression after by is a delegate, because the
 * get() (and set()) that correspond to the property will be delegated to its getValue() and setValue() methods.
 * Property delegates don't have to implement an interface, but they have to provide a
 * getValue() function (and setValue() for vars).
 */

class DelegatedClass {
    var a: String by Delegate()
    val b: String by Delegate()

    override fun toString() = "Delegated Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String =
        "$thisRef, is '${prop.name}' ${prop.returnType}"

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to '${prop.name}' in $thisRef.")
    }

}

fun main() {

    /**
     * When you read from p, which delegates to an instance of Delegate, the getValue() function from Delegate is called.
     * Its first parameter is the object you read p from, and the second parameter holds a description of p itself
     * (for example, you can take its name).
     */

    val e = DelegatedClass()
    println(e.a)
    println(e.b)
    e.a = "NEW"

}