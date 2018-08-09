package com.demo.hello

/*
数字类型:
    type    bit width
    Double  64
    Float   32
    Long    64
    Int     32
    Short   16
    Byte    8
 */

fun main(args: Array<String>) {

    // 数值变量/常量定义
    val longNum = 1_000L
    val doubleNum = 1_000.0
    val floatNum = 1_000.0f
    // 注意0x/0b直接跟下划线的写法是错误的
    val hexNum = 0xff_ff_00_11
    val binaryNum = 0b10_101
    val longNum2 = 1000L

    println("1000==1_000 相等不?  "+(longNum == longNum2))


}

// 打印数值类型最大值和最小值,获取取值范围    估计特别大的是也是bigInteger类型
fun printMaxAndMin() {
    println("输出不同类型的最大值和最小值")
    println("double max ${Double.MAX_VALUE}")
    println("double min ${Double.MIN_VALUE}")
    println()

    println("Float max ${Float.MAX_VALUE}")
    println("Float min ${Float.MIN_VALUE}")
    println()

    println("Long max ${Long.MAX_VALUE}")
    println("Long min ${Long.MIN_VALUE}")
    println()

    println("Int max ${Int.MAX_VALUE}")
    println("Int min ${Int.MIN_VALUE}")
    println()

    println("Short max ${Short.MAX_VALUE}")
    println("Short min ${Short.MIN_VALUE}")
    println()

    println("Byte max ${Byte.MAX_VALUE}")
    println("Byte min ${Byte.MIN_VALUE}")
    println()
}
