/**
 * In Kotlin, the map function is used to transform (or map) each element of a collection into something new.
 * It iterates over all the items in the collection and applies a transformation to each one, generating a new list
 * with the transformed results without altering the original collection.
 *
 * In summary: the map function takes something and transforms it into something else, but always returns a new list
 * with the transformed values.
 */

val numbers = listOf(1, 2, 3, 4, 5)
val doubled = numbers.map { it * 2 }

val names = listOf("Gui", "Ana", "Leo")
val uppercasedNames = names.map { it.uppercase() }

val people = ListRepository.people

val peopleNames = people.map { it.name }
val peopleDescription = people.map { "${it.name} is ${it.age} years old" }
val olderPeople = people.map { Person(name = it.name, age = it.age + 1) }

val employees = people.map { Employee(name = it.name, salary = it.age * 1000.0) }

fun main() {
    println("Numbers doubled: $doubled")
    println("Names to uppercase: $uppercasedNames")

    println("People names: $peopleNames")
    println("People description: $peopleDescription")
    println("Older people: $olderPeople")

    println("Employees: $employees")
}