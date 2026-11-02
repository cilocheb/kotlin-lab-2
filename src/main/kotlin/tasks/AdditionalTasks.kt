package tasks

/**
 * Обрабатывает пользовательский ввод.
 *
 * Если переданы числа через запятую, возвращает их сумму,
 * среднее значение, количество и отсортированный список.
 * Если передан текст, возвращает количество слов,
 * самое длинное слово и количество символов без пробелов.
 *
 * @param input пользовательский ввод
 * @return карта с результатами обработки
 */
fun processUserInput(input: String?): Map<String, Any> {
    if (input == null) {
        return emptyMap()
    }

    val parts = input.split(",").map { it.trim() }
    val numbers = parts.mapNotNull { it.toIntOrNull() }

    if (parts.isNotEmpty() && numbers.size == parts.size) {
        return mapOf(
            "sum" to numbers.sum(),
            "average" to numbers.average(),
            "count" to numbers.size,
            "sorted" to numbers.sorted()
        )
    }

    val words = input.trim()
        .split(Regex("\\s+"))
        .filter { it.isNotBlank() }

    return mapOf(
        "wordCount" to words.size,
        "longestWord" to (words.maxByOrNull { it.length } ?: ""),
        "charCount" to input.count { !it.isWhitespace() }
    )
}
