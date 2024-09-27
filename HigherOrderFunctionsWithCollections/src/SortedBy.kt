/**
 * The sortedBy() function is used to create a new sorted list based on a specific property of the elements.
 * The original collection is not modified.
 *
 * Note:
 * Kotlin collections also have a sort() function if the data type has a natural sort order.
 */
fun main() {
    people.sortedBy { it.age }.forEachIndexed { index, person ->
        println("[$index] = $person")
    }
    println()

    println("Alphabetical menu:")
    ListRepository.cookies.sortedBy { it.name }.forEachIndexed { index, cookie ->
        println("[$index] = $cookie")
    }
}