fun main() {
    println("You have ${shortEvents.size} short events.")
    println()

    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
    println()

    println("Last event of the day: ${events.last().title}")
    println("Duration of first event of the day: ${events.first().durationOfEvent}")

}

val events = mutableListOf(
    Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
    Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
    Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
    Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
    Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
    Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45),
    Event(title = "Study Kotlin", description = "Commit to studying Kotlin at least 15 minutes per day.", daypart = Daypart.EVENING, durationInMinutes = 15)
)

val shortEventsCount = events.count { it.durationInMinutes < 60 } // other solution
val shortEvents = events.filter { it.durationInMinutes < 60 }
val groupedEvents = events.groupBy { it.daypart.text }


