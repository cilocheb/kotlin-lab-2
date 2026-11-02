package org.example

import tasks.*
import kotlinx.coroutines.runBlocking

/**
 * Точка входа для тестирования лабораторной работы №2.
 *
 * @author Лаврентьев Аврам Петрович
 * @version 1.0
 * @since 2026-09-03
 */
fun main() {
    println("=== Тестирование лабораторной работы №2 ===\n")

    // Блок 1. Базовый синтаксис
    println(" Блок 1. Базовый синтаксис ")
    println(BasicSyntax.greetUser("Аврам", 20))
    println(BasicSyntax.getSeason(3))
    println(BasicSyntax.factorial(5))
    println()

    // Блок 2. Null-безопасность
    println(" Блок 2. Null-безопасность ")
    println(NullSafety.parseIntSafe("123"))
    println(NullSafety.parseIntSafe("abc"))
    println(NullSafety.parseIntSafe(null))
    println(NullSafety.filterNonNullAndDouble(listOf(1, null, 3, null, 5)))
    println()

    // Блок 3. Коллекции
    println(" Блок 3. Коллекции ")
    val people = listOf(
        Person("Анна", 25),
        Person("Иван", 30),
        Person("Мария", 35)
    )
    println(Collections.averageAge(people))
    println(Collections.groupByFirstLetter(listOf("apple", "apricot", "banana")))
    println(Collections.findLongestWord(listOf("apple", "banana", "pineapple")))
    println()

    // Блок 4. Корутины
    println(" Блок 4. Корутины ")
    runBlocking {
        Coroutines.delayedPrint("Начинаем выполнение...", 2000L)
        println(Coroutines.runParallelTasks())
    }

    println("\n--- Дополнительное задание ---")

    println(processUserInput("1,2,3,4,5"))
    println(processUserInput("Привет мир Kotlin"))
    println(processUserInput(null))

}
