package com.demo.hello

import java.util.*

// 返回值unit可以省略

fun useIf() {

    var count = Math.random() * 10

    // 如果不为null,转化为int
    println(count?.toInt())

}

fun main(args: Array<String>) {
}