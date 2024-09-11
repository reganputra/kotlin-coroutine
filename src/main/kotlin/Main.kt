package org.regan

import kotlinx.coroutines.*
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}