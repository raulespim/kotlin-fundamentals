/**
 * The find() function takes a predicate (a function that returns a boolean)
 * and returns the first element in the collection that satisfies the predicate.
 * If no element satisfies the predicate, find() returns null.
 *
 * Just like find(), firstOrNull() can also be used to find the first element that satisfies a condition.
 * The primary difference is that firstOrNull() can be more explicit about the intention of finding the 'first' element.
 *
 * Use:
 * - Use find() when you need to find the first element in a collection that satisfies a specific condition.
 *   It is a clear and efficient way to do this.
 *
 * - Use firstOrNull() if you want to be more explicit about the intention of finding the 'first' element.
 *   In many cases, find() and firstOrNull() are interchangeable.
 */
fun main() {

    println(personOlderThan30)
    println(firstAvailableProduct)
    println(firstNumberGreaterThan10)
}

// find()
val personOlderThan30 = people.find { it.age < 30 }
val firstAvailableProduct = ListRepository.products.find { it.inStock }

// firstOrNull()
val firstNumberGreaterThan10 = ListRepository.numbers.firstOrNull { it > 10 }