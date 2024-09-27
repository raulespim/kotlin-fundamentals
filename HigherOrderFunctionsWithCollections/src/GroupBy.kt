/**
 * The groupBy function allows you to group the elements of a collection based on a specific key.
 * The key can be any property or value derived from each item.
 * In the end, you get a Map where each key is associated with a list of elements that belong to that group.
 *
 * Note: If you only need to split a list in two, an alternative is the partition() function.
 */
val groupedMenu = ListRepository.cookies.groupBy { it.softBaked }

val softBakedMenu = groupedMenu[true] ?: emptyList()
val crunchyMenu = groupedMenu[false] ?: emptyList()

data class CookieKey(val softBaked: Boolean, val hasFilling: Boolean)
val groupedByObject = ListRepository.cookies.map { CookieKey(it.softBaked, it.hasFilling) }.groupBy { it }
val cookieKeyTrue = groupedByObject[CookieKey(true, true)] ?: emptyList()
val cookieKeyFalse = groupedByObject[CookieKey(false, false)] ?: emptyList()

fun main() {

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println()
    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println()
    println("CookieKeyTrue")
    cookieKeyTrue.forEachIndexed { index, cookie -> println("[$index] = $cookie") }
    println()
    println("CookieKeyFalse")
    cookieKeyFalse.forEachIndexed { index, cookie -> println("[$index] = $cookie") }
    println()

    ListRepository.cookies.groupBy { it.price < 1.50 }.also {
        val cheap = it[true] ?: emptyList()
        val expensive = it[false] ?: emptyList()

        println("Cookie cheap")
        cheap.forEachIndexed { index, cookie -> println("[$index] = $cookie") }
        println()
        println("Cookie expensive")
        expensive.forEachIndexed { index, cookie -> println("[$index] = $cookie") }
    }
}