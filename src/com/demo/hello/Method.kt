package com.demo.hello

import org.junit.Test

// 五参数 无返回值 unit可以不写
fun method_void(): Unit {

}

// 任意一个参数 返回int
fun method_one_param(x: Any): Int {
    return 0
}

// vararg可变长参数 默认和java一样写在参数列表,但是有其他的使用方式 返回值可为null
fun method_more_param(string: String, vararg x: Any): String? {
    return null
}

// 可以使用string="param"的方法调用
fun method_more_param(vararg x: Any, string: String): String? {
    return null
}

fun main(args: Array<String>) {
    method_more_param("weq", 1, 3, 4, 5)
    method_more_param(1, 2, 3, 4, string = "a")
}

