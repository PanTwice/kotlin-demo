package com.demo.hello

// 返回值unit可以省略

fun useIf() {

    val randomNum = Math.random() * 10

    println(randomNum?.toInt())

    if (randomNum > 5) {
        println("count > 5")
    } else {
        println("count < 5")
    }

    // 如果不为null,转化为int
}

fun main(args: Array<String>) {
    useIf()
}