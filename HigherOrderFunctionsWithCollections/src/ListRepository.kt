object ListRepository {
    val cookies = listOf(
        Cookie(
            name = "Chocolate Chip",
            softBaked = false,
            hasFilling = false,
            price = 1.69
        ),
        Cookie(
            name = "Banana Walnut",
            softBaked = true,
            hasFilling = false,
            price = 1.49
        ),
        Cookie(
            name = "Vanilla Creme",
            softBaked = false,
            hasFilling = true,
            price = 1.59
        ),
        Cookie(
            name = "Chocolate Peanut Butter",
            softBaked = false,
            hasFilling = true,
            price = 1.49
        ),
        Cookie(
            name = "Snickerdoodle",
            softBaked = true,
            hasFilling = false,
            price = 1.39
        ),
        Cookie(
            name = "Blueberry Tart",
            softBaked = true,
            hasFilling = true,
            price = 1.79
        ),
        Cookie(
            name = "Sugar and Sprinkles",
            softBaked = false,
            hasFilling = false,
            price = 1.39
        )
    )

    val people = listOf(
        Person(name = "Gui", age = 28),
        Person(name = "Ana", age = 25),
        Person(name = "Leo", age = 30)
    )

    val transactions = listOf(
        Transaction("credit", 100.0),
        Transaction("debit", 50.0),
        Transaction("credit", 200.0)
    )

    val products = listOf(
        Product("Laptop", false),
        Product("Mouse", true),
        Product("Keyboard", false)
    )

    val numbers = listOf(5, 9, 13, 8, 20)
}