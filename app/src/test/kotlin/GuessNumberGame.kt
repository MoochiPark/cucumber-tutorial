class GuessNumberGame(
    private val answer: String,
) {
    fun check(input: String): String {
        var a = 0
        var b = 0
        input.forEachIndexed { index, c ->
            if (answer[index] == c) {
                a++
            }
            if (answer.contains(c)) {
                b++
            }
        }

        return "${a}A${b - a}B"
    }

}

