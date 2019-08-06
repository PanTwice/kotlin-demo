package com.demo.hello.inter

// 定义接口
interface MyInterFace {

    val name: String

    fun say()
    fun eat()

    // 默认函数
    fun run() {
        println("it is run in interface myinterface")
    }

}

// 实现
class Person() : MyInterFace {

    override val name: String
        get() {
            return this.name
        }

    override fun eat() {
        println("I'm person, I can eat")
    }

    override fun say() {
        println("I'm person, I can say")
    }

}

interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun foo() {
        // 函数冲突的解决方法
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}


