enum class Daypart(val text: String) {
    MORNING("Morning"),
    AFTERNOON("Afternoon"),
    EVENING("Evening")
}

val Event.durationOfEvent: String get() = if (this.durationInMinutes < 60) "short" else "long"