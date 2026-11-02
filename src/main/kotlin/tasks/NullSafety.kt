package tasks

/**
 * Блок задач по null-безопасности в Kotlin.
 *
 * @author Лаврентьев Аврам Петрович
 * @version 1.0
 * @since 2026-09-03
 */
object NullSafety {

    /**
     * Задача 2.1. Безопасное преобразование строки в число.
     *
     * @param str Строка для преобразования (может быть null).
     * @return Число или null, если преобразование невозможно.
     *
     * Пример: parseIntSafe("123") -> 123
     * Пример: parseIntSafe("abc") -> null
     * Пример: parseIntSafe(null) -> null
     */
    fun parseIntSafe(str: String?): Int? {
        return str?.toIntOrNull()
    }

    /**
     * Задача 2.2. Фильтрация null-элементов и удвоение значений.
     *
     * @param list Список с возможными null-значениями.
     * @return Список с отфильтрованными и удвоенными значениями.
     *
     * Пример: filterNonNullAndDouble(listOf(1, null, 3, null, 5)) -> [2, 6, 10]
     */
    fun filterNonNullAndDouble(list: List<Int?>): List<Int> {
        return list.filterNotNull().map { it * 2 }
    }
}
