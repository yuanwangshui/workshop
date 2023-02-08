(https://blog.csdn.net/sinat_33250050/article/details/114433686)
（1）、当我们通过OkhttpClient创建一个Call，并发起同步或异步请求时； 

（2）、okhttp会通过Dispatcher对我们所有的RealCall（Call的具体实现类）进行统一管理，并通过execute()及enqueue()方法对同步或异步请求进行处理； 

（3）、execute()及enqueue()这两个方法会最终调用RealCall中的getResponseWithInterceptorChain()方法，从拦截器链中获取返回结果； 

（4）、拦截器链中，依次通过RetryAndFollowUpInterceptor（重定向拦截器）、BridgeInterceptor（桥接拦截器）、CacheInterceptor（缓存拦截器）、ConnectInterceptor（连接拦截器）、CallServerInterceptor（网络拦截器）对请求依次处理，与服务的建立连接后，获取返回数据，再经过上述拦截器依次处理后，最后将结果返回给调用方。
