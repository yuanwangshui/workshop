由于代理问题导致在sourcetree上push github 上的项目的时候总是失败，这是因为在拉取项目的时候没有走代理，所以需要配置一下。
配置方法如下：
1.
如果执行：git config --global https.proxy http://127.0.0.1:1080 时出现：fatal: not in a git directory

请先执行：git init

     2.设置代理：

git config --global https.proxy http://127.0.0.1:1080

git config --global https.proxy https://127.0.0.1:1080

git config --global --unset http.proxy

git config --global --unset https.proxy

npm config delete proxy

git config --global http.proxy 'socks5://127.0.0.1:1080'

git config --global https.proxy 'socks5://127.0.0.1:1080'
记得把端口号换成自己用的代理的端口号