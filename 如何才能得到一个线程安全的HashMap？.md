(https://www.cnblogs.com/gaoxufei/p/6060423.html)
方法一:通过Collections.synchronizedMap()返回一个新的Map,这个新的map就是线程安全的. 这个要求大家习惯基于接口编程,因为返回的并不是HashMap,而是一个Map的实现.

方法二:重新改写了HashMap,具体的可以查看java.util.concurrent.ConcurrentHashMap. 这个方法比方法一有了很大的改进.

(http://t.zoukankan.com/DreamFather-p-14577516.html)
方法三:使用HashTable

Map<String,Object> hashtable=new HashTable<>();

HashTable底层是数组和链表的形式，方法都是用synchronized修饰的，因此是线程安全的，但执行效率比较低。