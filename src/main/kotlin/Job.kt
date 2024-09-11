package org.regan

import kotlinx.coroutines.*
@InternalCoroutinesApi
fun main() = runBlocking {
    val job = launch {
//        needed time
        delay(1000)
        println("Start new job!")
    }

//    cancell time
    delay(500)
    job.cancel(cause = CancellationException("time is up!"))
    println("Cancelling...")
    if (job.isCancelled) println("Job is cancelled because ${job.getCancellationException().message}")
}