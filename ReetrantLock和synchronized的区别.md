synchronized与ReetrantLock的区别（个人见解，如果不对，请勿喷）
相同之处：
1、两者都是同时实现了锁的功能
2、两者都是可重入锁

不同之处：
（1）synchronized是独占锁，加锁和解锁的过程自动进行，易于操作，但不够灵活。 ReentrantLock也是独占锁，加锁和解锁的过程需要手动进行，不易操作，但非常灵活。
（2）synchronized可重入，因为加锁和解锁自动进行，不必担心最后是否释放锁；ReentrantLock 也可重入，但加锁和解锁需要手动进行，且次数需一样，否则其他线程无法获得锁。因为通过源码可以看出，获取到锁时，state值就会加1，释放锁就会减1，只有state等于0时，其他线程才可以获取到锁。
（3）synchronized不可响应中断，一个线程获取不到锁就一直等着；ReentrantLock可以响应中断。
（4）ReentrantLock可实现公平锁模式，即先入先执行。

另一种回答(https://www.bilibili.com/video/BV1XS4y1S7W1/?spm_id_from=333.337.search-card.all.click&vd_source=901f7f5955487658af7c988c17f4c3ff)视频中的评论
从功能来看：  
lock和synchronized都是java中解决线程安全问题的一个工具  
  
从特性来看：  
1.synchronized是一个同步关键字，lock是juc包里面提供的一个接口,这个接口他有很多的实现类，其中包括Reentrantlock这个重入锁的实现。  
  
从锁粒度来看：  
synchronized可以通过两种方式控制锁的粒度：  
1.把synchronized关键字修饰在方法层面  
2.修饰在同步代码块上  
并且我们可以通过synchronized加锁对象的生命周期，来控制锁的作用范围，比如锁对象是静态对象，或者类对象，那么这个锁就是属于全局锁，如果锁对象是实例对象，那么这个锁的范围取决于这个对象的生命周期。  
  
1.包裹在这两个方法之间的代码能够保证线程安全性。而锁的作用域取决于Lock实例的生命周期。  
2.Lock比Synchronized的灵活性更高，Lock可以自主决定什么时候加锁，什么时候释放锁，只需要调用lock()和unlock()这两个方法就行，同时Lock还提供了非阻塞的竞争锁方法tryLock()方法，这个方法通过返回true/false来告诉当前线程是否已经有其他线程正在使用锁。  
3.Synchronized由于是关键字，所以它无法实现非阻塞竞争锁的方法，另外Synchronized锁的释放是被动的，就是当Synchronized同步代码块执行完以后或者代码出现异常时才会释放。  
5.Lock提供了公平锁和非公平锁的机制，公平锁是指线程竞争锁资源时，如果已经有其他线程正在排队等待锁释放，那么当前竞争锁资源的线程无法插队。而非公平锁，就是不管是否有线程在排队等待锁，它都会尝试去竞争一次锁。 Synchronized只提供了一种非公平锁的实现。  
  
性能方面  
synchronized在性能方面和lock相差不大，在实现上会有一个区别synchronized引入了偏向锁，轻量级锁，重量级锁，以及锁升级的机制去实现锁的优化，而lock则用到了自旋锁的方式实现性能优化。