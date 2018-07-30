// 包名 和java是一样的
package com.demo.hello

// 定义类及函数
class first(val name: String){

    // 定义class里面的函数
    fun say(){
        println("hello, $name")
    }

}

// 主函数
fun main(args: Array<String>){
    // 类函数调用
    first("liu").say()
}
