package tasks

import kotlinx.coroutines.*

/**
 * Блок задач по корутинам в Kotlin.
 *
 * @author Лаврентьев Аврам Петрович
 * @version 1.0
 * @since 2026-09-03
 */
object Coroutines {

    /**
     * Задача 4.1. Асинхронная задержка с выводом сообщений.
     *
     * @param message Сообщение для вывода.
     * @param delayMs Время задержки в миллисекундах.
     */
    suspend fun delayedPrint(message: String, delayMs: Long) {
        println(message)
        delay(delayMs)
        println("Готово!")
    }

    /**
     * Задача 4.2. Параллельное выполнение трёх задач.
     *
     * Запускает три асинхронные задачи с задержками 1с, 2с, 3с.
     * Возвращает список результатов в порядке завершения.
     *
     * @return Список строк с результатами.
     */
    suspend fun runParallelTasks(): List<String> {
        return coroutineScope {
            val task1 = async {
                delay(1000)
                "Задача 1 завершена"
            }

            val task2 = async {
                delay(2000)
                "Задача 2 завершена"
            }

            val task3 = async {
                delay(3000)
                "Задача 3 завершена"
            }

            listOf(
                task1.await(),
                task2.await(),
                task3.await()
            )
        }
    }
}
