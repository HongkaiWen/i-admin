package com.github.hongkaiwen.iadmin

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking<Unit> {
  launch {
    println("hello")
  }
}
