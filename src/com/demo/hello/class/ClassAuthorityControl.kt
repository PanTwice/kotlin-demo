package com.demo.hello.`class`

private class a     // 私有
public class b      // 公开
internal class c    // 模块
// 还有一个关键字 protected 包访问权限

class outer {
    protected val time:String = "now"   // 子类可以访问,不可以直接加在类名上面
}