

gradle.properties 里面定义变量决定是否是独立运行：
isApplication = false
决定了主工程是否依赖可以独立运行的组件：

#### base
就是 BaseApplicaiton ，manifest 里面使用。


#### test
依赖 base、user-api
处理的 library 和 application ，同时处理了 manifest


test 使用了 UserService



#### user
依赖 base、user-api
处理的 library 和 application ，同时处理了 manifest

user 需要向外提供数据，因此定义了
UserInfo.api
UserService.api



#### user-api
定义了空数据 和 空接口
UserInfo 和 UserService
UserService是 .api,同时还需要  UserServiceImpl 的实现。
这个 module 自动生成。


为什么，调用接口的方法，就自动调用了 impl 的方法：







#### setting.gradle
里面通过脚本动态的生成了 module-api 












