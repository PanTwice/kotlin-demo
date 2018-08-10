package com.demo.hello

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertTrue

/**
 * junit4
 *  导入:
 *     1. 项目下新建lib包,复制junit包和hamcrest相关依赖到lib文件夹
 *     2. 鼠标右键,add as library导入包
 *   使用:
 *      @Test fun(){...}
 *
 * @author liu
 * @date    2018/08/10
 */
class JunitTest {

    @Test
    fun testPrintAny() {
        print(" my name is kotlin ")
        assertTrue(true)
    }

    @Test
    fun testFail(): Unit {
        Assert.fail("===============fail===============")
    }

}

