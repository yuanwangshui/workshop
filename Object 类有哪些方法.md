(https://blog.csdn.net/m0_50601240/article/details/124356314)
1.clone 保护方法，实现对象的浅复制，只有实现cloneable接口才能调用该方法，否则抛出CloneNotSupportedException异常

2.hashcode 一般用于哈希查找，获得哈希值，重写了equals方法一般都重写hashCode方法

3.equals 比较两个对象是否相等，一般在子类中都被重写

4.wait 使当前线程等待该对象的锁，，wait（）方法就是一直等待，直到锁被获得或者中断

5.notify 唤醒在该对象上等待的某个线程

6.notifyall 唤醒在该对象上等待的所有线程

7.toString 返回一个String对象，一般子类都有覆盖

8.getClass final方法，获得运行时类型返回一个class对象

9.finalize 用于释放资源，无法缺点该方法何时调用，很少使用