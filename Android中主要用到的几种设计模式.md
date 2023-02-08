Android中总共有23种设计模式，分别是
1、[Android 单例模式](https://www.jianshu.com/p/9c32aea34b6d "Android 单例模式")  
2、[Android Builder模式](https://www.jianshu.com/p/093e42472f1c "Android Builder模式")  
3、[Android 原形模式(深浅拷贝)](https://www.jianshu.com/p/15bc149bd0af "Android 原形模式(深浅拷贝)")  
4、[Android 工厂模式](https://www.jianshu.com/p/13f80d27b7f2 "Android 工厂模式")  
5、[Android 策略模式](https://www.jianshu.com/p/b76b9c265def "Android 策略模式")  
6、[Android 状态模式](https://www.jianshu.com/p/d8b76d7bfc10 "Android 状态模式")  
7、[Android 责任链模式](https://www.jianshu.com/p/5b261b7226b3 "Android 责任链模式")  
8、[Android 命令模式](https://www.jianshu.com/p/1e898a64ba29 "Android 命令模式")  
9、[Android 观察者模式](https://www.jianshu.com/p/ec399a25e9d4 "Android 观察者模式")  
10、[Android 备忘录模式](https://www.jianshu.com/p/ca7bae91f845 "Android 备忘录模式")  
11、[Android 迭代器模式](https://www.jianshu.com/p/cea65ea5f019 "Android 迭代器模式")  
12、[Android 模板方法模式](https://www.jianshu.com/p/0d40766e11f1 "Android 模板方法模式")  
13、[Android 访问者模式](https://www.jianshu.com/p/c0c4ae0d262c "Android 访问者模式")  
14、[Android 中介者模式](https://www.jianshu.com/p/265a53737044 "Android 中介者模式")  
15、[Android 代理模式](https://www.jianshu.com/p/2fedb6bad7f9 "Android 代理模式")  
16、[Android 组合模式(View与ViewGroup)](https://www.jianshu.com/p/b512a047604d "Android 组合模式(View与ViewGroup)")  
17、[Android 适配器模式(ListView与Adapter)](https://www.jianshu.com/p/fb558642823e "Android 适配器模式(ListView与Adapter)")  
18、[Android 装饰者模式](https://www.jianshu.com/p/55b5804abf48 "Android 装饰者模式")  
19、[Android 享元模式](https://www.jianshu.com/p/3a12c1f4a863 "Android 享元模式")  
20、[Android 外观模式](https://www.jianshu.com/p/4443c848b785 "Android 外观模式")  
21、[Android 桥接模式](https://www.jianshu.com/p/5ac2805a1df4 "Android 桥接模式")
以上工厂模式其实是两种设计模式。包含工厂模式和[抽象工厂](https://so.csdn.net/so/search?q=%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82&spm=1001.2101.3001.7020)模式，缺少“解释器模式”由于这种模式极少运用，多用于语言的文法。所以这里不做详述。

其中主要用到的有：(https://blog.csdn.net/iteye_3916/article/details/82605472)
[b]1、模板模式,如Activity:[/b] 
      每次新建一个Actiivty时都会覆盖onCreate，onStart等方法,这些方法在 
  父类中就相当于一个模板 
[b]2、观察者模式 [/b]
     Listener都相当于一个观察者,对一些事件的响应都进行观察,当发现有响应就进行做相应的处理 3、单例模式 
[b]3. Application 单例模式[/b]   
目的： 
希望对象只创建一个实例，并且提供一个全局的访问点。 结构是简单的，但是却存在一下情况； 
1.每次从getInstance()都能返回一个且唯一的一个对象。 2.资源共享情况下，getInstance()必须适应多线程并发访问。 3.提高访问性能。 
4.懒加载（Lazy Load），在需要的时候才被构造。 
 
[b]4、适配器模式 [/b]
   适配器模式是一种重要的设计模式，在 android 中得到了广泛的应用。适配器类似于现
实世界里面的插头，通过适配器，我们可以将分属于不同类的两种不同类型的数据整合起来，而不必去根据某一需要增加或者修改类里面的方法。 
在 android 中常见的适配器类有： BaseAdapter 、 SimpleAdapter 等 ，首先我们看看 android 应用层是如何使用适配器的： 
综合 listview 和 gallery ，发现它们有着类似的实现过程，在 setAdapter 里面获取 
适配的 item 的个数，然后通知各自的控件构造这些 item ，构造的时候会通过适配器来获取需要适配的 view 。 
[b]5，工厂模式[/b] 
ndroid中的应用：创建位图 
Bitmap bitmap=BitmapFactory.decodeResource(getResources(), R.drawable.ic_action_search) 
这条语句相信我们经常用到，BitmapFactory顾名思义，就是位图工厂，专门用来将制定的图片转化为指定的位图Bitmap。因为图片来源的不同可能导致图片大小，格式类型等的多种多样，这样就导致了生成目标对象的复杂度，因此通过工厂统一的加工成同样大小，类型的”标准件“,大大简化了代码的复杂度与工作量。如activity 的基类父类等，抽象父类来生成对应的实际子类。 
[b]6，代理模式 [/b]
Android系统中利用AIDL定义一种远程服务时就需要用到代理模式。