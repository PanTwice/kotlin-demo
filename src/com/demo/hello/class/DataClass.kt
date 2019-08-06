package com.demo.hello.`class`

// 估计是做对象类的,应该就是java里面实体类的意思
data class Pen(val height: Double, val width: Double) {
}

fun main(args: Array<String>) {
    val pen = Pen(10.0, 1.0)
    // copy函数可以修改类的某些属性
    val copy = pen.copy(height = 11.1)
    val copy1 = pen.copy(width = 20.1)


}