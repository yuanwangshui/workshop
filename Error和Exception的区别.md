Error 和 Exception 都是Throwable的子类, 在java中只有Throwable类型的实例才可以被抛出或者捕获,它是异常处理机制的基本类型.

1,Exception 和 Error体现了java平台设计者对不同异常情况的分类, Exception是程序正常运行中,可以预料的意外情况,可以被捕获,进行相应的处理.
2.Error 是指正常情况下,不大可能出现的情况,绝大部分的Error 都会导致程序处于非正常的,不可恢复的状态, 不需要捕获, 常见的OutOfMemoryError 是Error的子类.
3.Exception 分为可检查异常(checked) 和 不可检查异常(unchecked).可检查异常在源代码里必须显式的进行捕获处理,这是编译期检查的一部分,不可检查异常是指运行时异常, 比如NullPointerException, ArrayIndexOutOfBoundsException之类, 通常是可以编码避免的逻辑错误,具体根据需要来判断是否需要捕获,并不会在编译期强制要求.