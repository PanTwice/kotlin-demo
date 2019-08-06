package com.demo.hello

fun main(args: Array<String>) {
    // 异常处理还是java的try..catch这样的形式,没有什么改进的样子
    try {
        var int = 10
    } catch (e: Exception) {
        throw e
    }
}