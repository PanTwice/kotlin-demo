package com.demo.hello

import java.util.*

/**
 * 貌似是用的都是java的随机数函数,kotlin自己有没有随记数生成的函数呢?
 */
fun main(args: Array<String>) {

}

/**
 * 使用random类
 */
fun random1() {
    var randomObj = Random()
    val randomNum = randomObj.nextInt(10)
    println(randomNum)
}

/**
 * 使用math类
 */
fun random2(): Unit {
    val randomNum = Math.random()*10
    println(randomNum)
}

