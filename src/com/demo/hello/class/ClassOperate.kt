package com.demo.hello.`class`

/**
 *  类的创建和其他使用,比如构造,析构,成员变量,静态方法等等
 *
 */

// 可以发现constructor关键字可以省略 构造函数
class person_omit(var name: String, var age: Int) {

    // 初始化代码块
    init {
        println("init_omit")
    }

    fun say() {
        println("my name is $name , my age is $age")
    }

}

// 如果构造函数有注解或者可见性修饰符,比如public,那么constructor关键字是必须的
class person_full constructor(var name: String, var age: Int) {
    init {
        println("init_full")
    }

    fun say() {
        println("my name is $name , my age is $age")
    }
}

class MoreConstructor(name: String) {

    // 次级构造调用主构造
    constructor(name: String, age: Int) : this(name) {
        println("name is $name, age is $age")
    }

    // 次级构造调用上一级构造,上一级函数也会执行,会把上一级构造函数内容先执行,然后执行本级构造函数
    constructor(name: String, age: Int, sex: String) : this(name, age) {
        println("name is $name, age is $age ,sex is $sex ")
    }

}

// 私有构造, 默认是public
class SelishMan private constructor() {
    public fun getInstance(): SelishMan {
        return SelishMan()
    }
}

class InitDemo(name: String) {
    // 多个初始化块会按照定义顺序运行
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

// 类的继承,open关键字说明这个类允许继承,默认是final
open class Base(intNum: Int) {

    open val size: Int =
            intNum.also { println("Initializing size in Base: $it") }

    open fun say() {
        println("it's base")
    }
}

// 继承base(intNum是必须的)
class ExtendBase(intNum: Int) : Base(intNum) {

    // 覆写变量
    override val size: Int =
            (super.size + intNum).also { println("Initializing size in Derived: $it") }

    // 覆写函数的前提是父类的函数必须是open的,和继承一个道理 ,继承的实现必须写override
    final override fun say() {
        println("it is extendBase")
    }

}

open class Foo {
    open fun f() {
        println("Foo.f()")
    }

    open val x: Int get() = 1
}

class Bar : Foo() {
    override fun f() {
        super.f()
        println("bar.f()")
    }

    override val x: Int get() = 0

    inner class Baz {
        // 内部类调用外部类及父类方法
        fun g() {
            // 调用 Foo 实现的 f()
            super@Bar.f()
            // 使用 Foo 实现的 x 的 getter
            println(super@Bar.x)
        }
    }
}

// 很好玩的一个例子,貌似是使用了java8接口的默认函数吧 default
open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // 接口成员默认就是“open”的

    fun b() {
        print("b")
    }
}

class C() : A(), B {
    // 编译器要求覆盖 f()：
    override fun f() {
        super<A>.f() // 调用 A.f()
        super<B>.f() // 调用 B.f()
    }
}


class varType {

    var trueFlag: Boolean
        private set(value) {
            trueFlag = value
        }
        get() {
            return trueFlag
        }

    var str: String? = "liu".trim()
        public get() {
            return str?.trim()
        }



}


fun main(args: Array<String>) {
    // 可以看出省略构造函数关键字最后的效果是一样的
    person_omit("liu", 25).say()
    person_full("liu", 25).say()

    InitDemo("liu")

    MoreConstructor("liu")
    MoreConstructor("liu", 22)
    MoreConstructor("liu", 23, "man")

    // 注意观察基础类的初始化顺序
    val d = ExtendBase(10)

}
