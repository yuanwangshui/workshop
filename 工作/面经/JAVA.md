### 问题1：[try-catch-finally finally一定会执行么？finally和return执行顺序](https://blog.csdn.net/HandCream123/article/details/120115406)
答: finally一定会执行。

当return只在外层时则try-catch-finally顺序执行（有异常才执行catch）；

当try中有return时，程序执行try代码块中return之前（包括return语句中的表达式运算）代码，然后
	1.无异常：再执行finally中的代码块，最后执行try中return；外层（return 4；）不再执行，因为程序在try中已经return过了。
	2.有异常：执行catch，再执行finally，执行外层外层return。

当catch中有return时，程序先执行try代码块，如果遇到异常执行catch：
	1.出现异常：程序执行catch代码块中return之前（包括return中的表达式运算）代码；再执行finally中的代码块，最后执行catch中return；外层（return 4；）不再执行。
    2.没有异常：程序执行try代码块，再执行finally代码块，最后再（return 4；）。

当try和finally中有return时，程序执行try块中return之前（包括return语句中的表达式运算）代码：
	 1.出现异常：程序执行catch块；再执行finally块，因为finally块中有return所以提前退出；外层（return 4；）不再执行。顺序执行：try(未出现异常的代码)-catch-finally；
    2.没有异常：因为finally块中有return执行finally，顺序执行：try-finally；
       

当catch和finally中有return时，程序执行try块中代码：
	1.出现异常：程序执行catch块中return之前（包括return语句中的表达式运算）代码；再执行finally块，因为finally块中有return所以提前退出。而不再执行catch中的return。
	2.没有异常：执行try后跳过catch执行finally；

当try，catch和finally中有return时，程序执行try块中return之前（包括return语句中的表达式运算）代码：
	1.出现异常：执行catch块中return之前（包括return语句中的表达式运算）代码；再执行finally块，因为finally块中有return所以提前退出。
	2.没有异常：执行finally块，因为finally块中有return所以提前退出。


### 问题2：[java8（JDK1.8）新特性](https://blog.csdn.net/weixin_40294256/article/details/126338618)
1、Lamdba表达式
2、[函数式接口](https://so.csdn.net/so/search?q=%E5%87%BD%E6%95%B0%E5%BC%8F%E6%8E%A5%E5%8F%A3&spm=1001.2101.3001.7020)
3、[方法引用](https://so.csdn.net/so/search?q=%E6%96%B9%E6%B3%95%E5%BC%95%E7%94%A8&spm=1001.2101.3001.7020)和构造引用
4、Stream API
5、接口中的默认方法和静态方法
6、新时间日期API
7、OPtional

### 问题3：[线程池的种类](https://blog.csdn.net/bangyanya/article/details/123518146)
5种：
1. newCachedThreadPool
2. newFixedThreadPool
3. newSingleThreadExecutor
4. newScheduleThreadPool
5. newSingleThreadScheduledExecutor

### 问题4：[装箱和拆箱](https://blog.csdn.net/qq_43386944/article/details/119773230)
**装箱**就是  **自动将基本数据类型转换为包装器类型**；
**拆箱**就是  **自动将包装器类型转换为基本数据类型**。

### 问题5：[谈谈Integer i = new Integer(xxx)和Integer i =xxx;这两种方式的区别](https://blog.csdn.net/qq_43386944/article/details/119773230)
1）第一种方式不会触发自动装箱的过程；而第二种方式会触发；
2）在执行效率和资源占用上的区别。第二种方式的执行效率和资源占用在一般性情况下要优于第一种情况（注意这并不是绝对的）。

### 问题6：[HashMap为什么线程不安全](https://blog.csdn.net/huayushuangfei/article/details/121380703)
JDK1.7 中，由于多线程对HashMap进行扩容，调用了HashMap#transfer()，具体原因：某个线程执行过程中，被挂起，其他线程已经完成数据迁移，等CPU资源释放后被挂起的线程重新执行之前的逻辑，数据已经被改变，造成死循环、数据丢失。
JDK1.8 中，由于多线程对HashMap进行put操作，调用了HashMap#putVal()，具体原因：假设两个线程A、B都在进行put操作，并且hash函数计算出的插入下标是相同的，当线程A执行完第六行代码后由于时间片耗尽导致被挂起，而线程B得到时间片后在该下标处插入了元素，完成了正常的插入，然后线程A获得时间片，由于之前已经进行了hash碰撞的判断，所有此时不会再进行判断，而是直接进行插入，这就导致了线程B插入的数据被线程A覆盖了，从而线程不安全。

### 问题7：[[final、finally、finalize的区别？]](https://blog.csdn.net/qq_49354230/article/details/125249879)23.1.17

### 问题8：[[抽象类和接口的区别]](https://blog.csdn.net/m0_51358164/article/details/125153230)

### 问题9：[[Error和Exception的区别]](https://blog.csdn.net/weixin_52188374/article/details/117521327)

### 问题10：[[讲讲乐观锁和悲观锁]](https://www.bilibili.com/video/BV1B3411a7jz/?spm_id_from=333.337.search-card.all.click&vd_source=901f7f5955487658af7c988c17f4c3ff)23.1.18

### 问题11：[[volatile的作用]](https://www.bilibili.com/video/BV1x3411B7GE/?spm_id_from=333.1007.top_right_bar_window_history.content.click&vd_source=901f7f5955487658af7c988c17f4c3ff)

### 问题12：[[Hashmap为什么不用平衡树]]

### 问题13：[[能说一下HashMap的数据结构吗]](https://www.shuzhiduo.com/A/MyJx4NEAJn/)(https://www.bilibili.com/video/BV1Pp4y1b79K?p=5&vd_source=901f7f5955487658af7c988c17f4c3ff)

### 问题14：[[ReetrantLock和synchronized的区别]](https://blog.csdn.net/wei_zhi_zlq/article/details/128535996)2023.1.19

### 问题15：[[如何才能得到一个线程安全的HashMap？]]

### 问题16：[[GC的垃圾回收算法有哪些]](2023.1.23)

### 问题17：[[单例模式]]

### 问题18：[[懒汉和饿汉式的区别]]

### 问题19：[[Object 类有哪些方法]](2023.1.24)

### 问题20：[[String 类的常用方法]]

### 问题21：[[Java中private关键字的作用]]

### 问题22：[[线程的生命周期]](2023.1.25)

### 问题23：[[哪些对象可以作为gc root]]

### 问题24：[[引用计数器的缺点]]

### 问题25：[[sleep和wait的区别]]

### 问题26：[[解释下什么是面向对象]](2023.1.26)

### 问题27：[[面向对象和面向过程得到区别]]

### 问题28：[[面向对象的三大特性？解释下]]


