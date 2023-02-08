都用来进行线程控制,他们最大本质的区别是:sleep()不释放同步锁,wait()释放同步缩.；

	基本差别
sleep是Thread类的方法，wait是Object类中定义的方法
sleep()方法可以在任何地方使用
wait()方法只能在synchronized方法或synchronized块中使用
 

	本质区别
Thread.sleep只会让出CPU，不会导致锁行为的改变
Object.wait不仅让出CPU，还会释放已经占有的同步资源锁
(https://blog.csdn.net/qq_38998213/article/details/89503556)