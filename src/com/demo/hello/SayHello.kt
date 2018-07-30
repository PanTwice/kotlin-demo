// 包名 和java是一样的
package com.demo.hello

// 定义类 有参构造 必须有参数传递
class First(val name: String) {

    // 无参函数
    fun say() {
        println("hello, $name")
    }

}

// 定义类 无参构造 没有参数传递
class Num() {
    var x: Int = 0
    var y: Int = 0

    // 这并不是构造函数,查询资料看构造函数如何完成
    fun Num(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    // 有参函数
    fun sum(): Int {
        return this.x + this.y
    }

}

// 主函数
fun main(args: Array<String>) {

    First("liu").say()
    var sum: Int = 0
    val num = Num()

    sum = num.sum()
    println("第一次求和:\t"+sum)

    num.Num(1,2)
    sum = num.sum()
    println("第二次求和:\t"+sum)

    num.x = 2
    sum = num.sum()
    println("第三次求和:\t"+sum)

}
/**
 * 思考和java的不同:
 *  1. 分号不是必须的
 *  2.
 */
