package tasks

/**
 * Блок задач по коллекциям в Kotlin.
 *
 * @author Лаврентьев Аврам Петрович
 * @version 1.0
 * @since 2026-09-03
 */
object Collections {

    /**
     * Задача 3.1. Вычисление среднего возраста.
     *
     * @param people Список людей.
     * @return Средний возраст или 0.0, если список пуст.
     */
    fun averageAge(people: List<Person>): Double {
        return if (people.isEmpty()) {
            0.0
        } else {
            people.map { it.age }.average()
        }
    }

    /**
     * Задача 3.2. Группировка слов по первой букве.
     *
     * @param words Список слов.
     * @return Map, где ключ - первая буква, значение - список слов.
     */
    fun groupByFirstLetter(words: List<String>): Map<Char, List<String>> {
        return words.groupBy { it.first().uppercaseChar() }
    }

    /**
     * Задача 3.3. Поиск самого длинного слова.
     *
     * @param words Список слов.
     * @return Самое длинное слово или null, если список пуст.
     */
    fun findLongestWord(words: List<String>): String? {
        return words.maxByOrNull { it.length }
    }
}
