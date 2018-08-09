package com.demo.hello

/**
 * Char     字符类型     'a'
 * String   字符串类型   "a"
 * 转义字符:
 *      \t、 \b、\n、\r、\'、\"、\\ 与 \$。 编码其他字符要用 Unicode 转义序列语法：'\uFF00'
 */
fun main(args: Array<String>) {

    //原始字符串,转义无效且可以包含任意字符
    val str= """
        abc "123"
        ad\\nad
        23312
    """.trimIndent()
    println(str)

}