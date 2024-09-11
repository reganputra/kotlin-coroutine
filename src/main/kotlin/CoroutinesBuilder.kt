package org.regan

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun getCapital():Int{
    delay(800L)
    return 5000
}

suspend fun getIncome(): Int{
    delay(1000L)
    return 75000
}

fun main() = runBlocking{

    val measureTime1 = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("your profit is ${income.await() - capital.await()}")
    }

    val measureTime2 = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    println("Compeleted in $measureTime1 ms vs $measureTime2 ms")
}