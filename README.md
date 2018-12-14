### learn-gateway
learn-gateway
## 网关访问
http://localhost:6604/userapi/user/users/10
## 通过服务直接访问
http://localhost:6601/user/users/10
## 项目结构
>IDEA点击视图工具图标Terminal，可以看到一个类似命令行的视图界面
>输入命令： tree >> F:\work\tree.txt


<pre>
learn-gateway
├─.idea
│  └─inspectionProfiles
├─eurekaconfig
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─learn
│      │  │          └─example
│      │  │              └─eurekaconfig
│      │  └─resources
│      └─test
│          └─java
│              └─com
│                  └─learn
│                      └─example
│                          └─eurekaconfig
├─log
├─userservice
│  └─src
│      ├─main
│      │  ├─java
│      │  │  └─com
│      │  │      └─learn
│      │  │          └─example
│      │  │              └─userservice
│      │  │                  ├─controller
│      │  │                  ├─model
│      │  │                  ├─repository
│      │  │                  └─service
│      │  │                      └─impl
│      │  └─resources
│      │      ├─static
│      │      └─templates
│      └─test
│          └─java
│              └─com
│                  └─learn
│                      └─example
│                          └─userservice
└─webgateway
    └─src
        ├─main
        │  ├─java
        │  │  └─com
        │  │      └─learn
        │  │          └─example
        │  │              └─gateway
        │  └─resources
        │      ├─static
        │      └─templates
        └─test
            └─java
                └─com
                    └─learn
                        └─example
                            └─gateway
</pre>
