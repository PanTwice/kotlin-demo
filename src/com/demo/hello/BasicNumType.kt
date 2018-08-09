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
 每一个都支持的转化:
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
  位运算:
    shl(bits) – 有符号左移 (Java 的 <<)
    shr(bits) – 有符号右移 (Java 的 >>)
    ushr(bits) – 无符号右移 (Java 的 >>>)
    and(bits) – 位与
    or(bits) – 位或
    xor(bits) – 位异或
    inv() – 位非
 */

fun main(args: Array<String>) {

    compareIntAndLong()
    createType()

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

// 类型创建
fun createType() {

    // 数值变量/常量定义
    val longNum = 1_000L
    val longNum2 = 1000L
    println("1000==1_000 相等不?:${(longNum == longNum2)}"  )

    val doubleNum = 1_000.0
    val floatNum = 1_000.0f
    // 注意0x/0b直接跟下划线的写法是错误的
    val hexNum = 0xff_ff_00_11
    val binaryNum = 0b10_101

    val defaultIntType = 10
    val defaultDoubleType = 10.00

    println("defaultInt type is ${defaultIntType.javaClass}")
    println("defaultDouble type is ${defaultDoubleType.javaClass}")

    // 本来想看看默认值,结果提示我必须初始化 要不然就是语法错误
    val defaultByteValue:Byte?
    val defaultIntValue:Int
    val defaultLongValue:Long
    val defaultShortValue:Short
    val defaultFloatValue:Float
    val defaultDoubleValue:Double
    //println("defaultByteValue  is $defaultByteValue")

    // char 转化为int后可以发现也是对应的 但是下面的和对应数字直接比较会报语法错误 估计原因还是不是同类型的原因
    val charA:Char = 'a'
    println("charA to int is ${charA.toInt()} ")
//    if (charA == 97){
//        ..
//    }

}

// 值比较和地址比较
fun compareValueOrAddr(){

    val num = 10000
    // a,b 相等于创建了新的对象
    val a: Int? = num
    val b: Int? = num
    // c,d java里面常量的概念,相同的指针引用
    val c: Int = num
    val d: Int = num

    println("num === a?: ${num === a}")
    println("num === b?: ${num === b}")

    println("a == b?: ${a == b}")
    println("a === b?: ${a === b}")

    println("c == d?: ${c == d}")
    println("c === d?: ${c === d}")

}

// 类型转换
fun compareIntAndLong() {

    val a:Int = Long.MAX_VALUE.toInt()
    val b:Long = Long.MAX_VALUE
    //a == b 语法错误/false,原因是类型不一致,kotlin没有隐式类型转换,需要去显式转换
    //println("int a == long b?${a==b}")
    // 注意小转大,大转小存在精度丢失的问题 大转小这里已经精度了,小转大才是正确做法
    println("a is $a, b is $b, a.toLong is ${a.toLong()}, b.toint is ${b.toInt()}")
    println("int a == long b?${a==b.toInt()}")
    println("int a == long b?${a.toLong()==b}")

    // kotlin 在算数运算是会做一定的转化,小转大
    val c = 1L + 100
    println("c is ${c.javaClass}")

}

