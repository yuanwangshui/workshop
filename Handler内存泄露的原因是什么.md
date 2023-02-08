(https://blog.csdn.net/cpcpcp123/article/details/122000274)
1、原因一延迟消息

Handler导致内存泄漏一般发生在发送延迟消息的时候，当Activity关闭之后，延迟消息还没发出，那么主线程中的MessageQueue就会持有这个消息的引用，而这个消息是持有Handler的引用，而handler作为匿名内部类持有了Activity的引用，所以就有了以下的一条引用链。

主线程 —> threadlocal —> Looper —> MessageQueue —> Message —> Handler —> Activity

其根本原因是因为这条引用链的头头，也就是主线程，是不会被回收的，所以导致Activity无法被回收，出现内存泄漏，其中Handler只能算是导火索。

2、原因二子线程不回收

而我们平时用到的子线程通过Handler更新UI，其原因是因为运行中的子线程不会被回收，而子线程持有了Actiivty的引用（不然也无法调用Activity的Handler），所以就导致内存泄漏了，但是这个情况的主要原因还是在于子线程本身。

所以综合两种情况，在发生内存泄漏的情况中，Handler都不能算是罪魁祸首，罪魁祸首（根本原因）都是他们的头头——线程。