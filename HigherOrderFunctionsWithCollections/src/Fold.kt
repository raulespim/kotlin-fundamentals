/**
 * The fold() function is used to generate a single value from a collection.
 * This is most commonly used for things like calculating a total of prices,
 * or summing all the elements in a list to find an average.
 *
 * The fold() function takes two parameters:
 *
 * - An initial value. The data type is inferred when calling the function
 *  (that is, an initial value of 0 is inferred to be an Int).
 * - A lambda expression that returns a value with the same type as the initial value.
 *
 * The lambda expression additionally has two parameters:
 *
 * - The first is known as the accumulator. It has the same data type as the initial value.
 *   Think of this as a running total. Each time the lambda expression is called,
 *   the accumulator is equal to the return value from the previous time the lambda was called.
 * - The second is the same type as each element in the collection.
 *
 * Like other functions you've seen, the lambda expression is called for each element in a collection, so you can use fold() as a concise way to sum all the elements.
 *
 *
 * Note:
 * fold() is sometimes called reduce().
 * The fold() function in Kotlin works the same as the reduce() function found in JavaScript, Swift, Python, etc.
 * Note that Kotlin also has its own function called reduce(),
 * where the accumulator starts with the first element in the collection,
 * rather than an initial value passed as an argument.
 *
 *
 * Note:
 * Kotlin collections also have a sum() function for numeric types, as well as a higher-order sumOf() function.
 */
fun main() {
    println("Total price: $${totalPrice}")
    println(totalBalance)
}

val totalPrice = ListRepository.cookies.fold(0.0) { total, cookie ->
    total + cookie.price
}

val totalBalance = ListRepository.transactions.fold(0.0) { acc, transaction ->
    if (transaction.type == "credit") acc + transaction.amount
    else acc - transaction.amount
}