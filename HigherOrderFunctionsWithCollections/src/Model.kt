data class Cookie(
    val name: String = "",
    val softBaked: Boolean = false,
    val hasFilling: Boolean = false,
    val price: Double = 0.0
)

data class Person(val name: String, val age: Int, val city: String? = null)

data class Transaction(val type: String, val amount: Double)

data class Employee(val name: String, val salary: Double)

data class Product(val name: String, val inStock: Boolean)