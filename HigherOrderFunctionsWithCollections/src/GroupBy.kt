/**
 * The groupBy function allows you to group the elements of a collection based on a specific key.
 * The key can be any property or value derived from each item.
 * In the end, you get a Map where each key is associated with a list of elements that belong to that group.
 *
 * Note: If you only need to split a list in two, an alternative is the partition() function.
 */
val groupedMenu = CookieRepository.cookies.groupBy { it.softBaked }

val softBakedMenu = groupedMenu[true] ?: emptyList()
val crunchyMenu = groupedMenu[false] ?: emptyList()

data class CookieKey(val softBaked: Boolean, val hasFilling: Boolean)
val groupedByObject = CookieRepository.cookies.groupBy { CookieKey(it.softBaked, it.hasFilling) }

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
    println(groupedByObject)
}