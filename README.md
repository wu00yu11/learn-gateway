### learn-gateway
learn-gateway
## 网关访问
http://localhost:6604/userapi/user/users/10
## 通过服务直接访问
http://localhost:6601/user/users/10
## 项目结构
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
