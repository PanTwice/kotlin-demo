package com.demo.hello

/**
 * if的完整写法
 */
fun maxOf_full(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * 省略版本
 */
fun maxOf_omit(a: Int, b: Int) = if (a > b) a else b

fun iterListAndMap() {

    // 只读list 这个list是没有add方法的
    var numList = listOf(1, 2, 3, 4, 5, 6, 7)
    // 遍历
    for (i in numList) {
        print(i.toString() + "\t")
    }
    println()
    // 遍历[1,10]
    for (i in 1..10) {
        print(i.toString() + "\t")
    }

    println()
    // 遍历[10,0]
    for (i in 10 downTo 0 step 1) {
        print(i.toString() + "\t")
    }
    println()
    // 遍历[10,0] 间隔2 10 8 6 4 2 0
    for (i in 10 downTo 0 step 2) {
        print(i.toString() + "\t")
    }

    println()
    val list = listOf("banana", "avocado", "apple", "kiwifruit")
    // 遍历获取索引
    for (i in list.indices) {
        print(list.get(i) + "\t")
    }

    println()
    // 更见得遍历
    list.forEach { print(it + "\t") }

    println()
    // 过滤排序后打印
    list
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .forEach { print(it + "\t") }

    println()
    // 只读map
    var map = mapOf(
            "a" to "a-1",
            "b" to "b-2",
            "c" to "c-3",
            "d" to "d-4"
    )
    // 获取key-value的格式
    for ((key, value) in map) {
        print(key + ":" + value + " ")
    }

    println()
    val array = arrayOf(1, 2, 3, 4, 5)
    println("array[0]=${array[0]}")
    println("array.get(0)=${array.get(0)}")
    // 会报错下标越界
    //array.set(5, 6)
    // 修改数组对应下标值
    array.set(array.size-1,array.size+1)
    array.iterator().forEach { print(it.toString()+"\t") }

    println()
    // 创建固定大小的数组且初始化
    var array2 = Array(5,{i -> i})
    array2.iterator().forEach { print(it.toString()+"\t") }

}

// 输入任意类型
fun judgeType(any: Any) {

    // when == swich
    when (any) {
        // 类型判断 判断出类型后可以在直接使用转化后的类型的函数
        is Boolean -> {
            println("it's boolean ")
        }
        is Long -> {
            println("it's long")
        }
        is Double -> {
            println("it's double")
        }
        is Float -> {
            println("it's float")
        }
        is Int -> {
            println("it's int")
        }
        is Byte -> {
            println("it's byte")
        }
        is String -> {
            println("it's string ")
        }
        else -> {
            println("it's others")
        }
    }

}

fun main(args: Array<String>) {
    iterListAndMap()
//    judgeType(1.0)
}