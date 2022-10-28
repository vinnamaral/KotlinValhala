package aus.vinnamaral.kotlin.invokeOperator


data class Person(val name: String, val age: Int, val weight: Double)

val personBuilder: (String) -> (Int) -> (Double) -> Person = { name ->
    { age ->
        { weight ->
            Person(name, age, weight)
        }
    }
}