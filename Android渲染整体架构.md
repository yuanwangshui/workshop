(https://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=2650263098&idx=1&sn=2f760a3934d30fd3bf5ac16d5a774cc0&chksm=88633f55bf14b643aa3fa2df27faad38a68fc0120f38648eaa1bd729d466d066b0508d492e37&scene=27) 
- image stream produceers：渲染数据的生产者，如App的draw方法会把绘制指令通过canvas传递给framework层的RenderThread线程。
    
-   native Framework：RenderThread线程通过surface.dequeue得到缓冲区graphic bufer，然后在上面通过OpenGL来完成真正的渲染命令。在把缓冲区交还给BufferQueue队列中。
    
-   image stream consumers：surfaceFlinger从队列中获取数据，同时和HAL完成layer的合成工作，最终交给HAL展示。
    
-   HAL：硬件抽象层。把图形数据展示到设备屏幕。