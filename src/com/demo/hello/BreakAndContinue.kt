package com.demo.hello

import org.junit.Test
import kotlin.test.assertEquals

/**
 *
 *  Kotlin 有三种结构化跳转表达式：
        return      默认从最直接包围它的函数或者匿名函数返回。
        break       终止最直接包围它的循环。
        continue    继续下一次最直接包围它的循环。
 */
class BreakAndContinue {

    @Test
    fun testBreakAndContinue() {
        // break 中断循环, continue 跳出本次运算,循环继续
        var count = 0
        while (true) {
            if (count == 10) {
                break
            }
            count++
        }

        assertEquals(10, count)

        count = 0
        var nums = 1..10

        // 循环标签写法 string@
        loop@
        for (num in nums) {
            for (num in nums) {
                count++
                // 循环标签用法 break@loop
                if (count == 50) break@loop
            }
        }

        assertEquals(50, count)

        count = 0
        loop@
        for (num in nums) {
            for (num in nums) {
                // 循环标签用法continue@loop
                if (num % 10 == 0) continue@loop
                count++
            }
        }

        assertEquals(90, count)

        val list = listOf(1, 2, 3, 4, 5)
        // 结果 1245 少了3 也就是3的被结束了
        // 函数标签用法 相当于continue
        list.forEach {
            if (it == 3) return@forEach
            print(it)
        }

        println()
        // 上面写法的显式写法 相当于continue
        listOf(1, 2, 3, 4, 5).forEach loop@ {
            if (it == 3) return@loop // 局部返回到匿名函数的调用者，即 forEach 循环
            print(it)
        }

        println()
        // 匿名函数写法 相当于continue
        listOf(1, 2, 3, 4, 5).forEach(
                fun(value: Int) {
                    if (value == 3) return  // 局部返回到匿名函数的调用者，即 forEach 循环
                    print(value)
                })


        println()
        // 匿名函数写法 相等于break
        run loop@ {

            listOf(1, 2, 3, 4, 5).forEach(
                    fun(value: Int) {
                        if (value == 3) return@loop  // 局部返回到匿名函数的调用者，即 forEach 循环
                        print(value)
                    })
        }

    }


}