package com.demo.hello

class first(val name: String){
    fun say(){
        println("hello, $name")
    }
}

fun main(args: Array<String>){
    first("liu").say()
}
