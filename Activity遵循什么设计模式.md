https://www.jianshu.com/p/9a441ca1ff51  
模板模式
**定义：定义一个操作中的算法的框架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。  
使用场景：**  
1、多个子类有公共的方法，并且逻辑基本相同。  
2、重复、复杂的算法，可以把核心算法设计为模版方法，周边的相关细节功能则由子类实现。  
3、重构时，模版方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。  
Android中的使用，Activity的生命周期函数。  
onCreate、onStart、onResume。。有一定的逻辑顺序，但是我们可以重新这些函数。
