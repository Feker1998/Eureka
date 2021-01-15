# Eureka
mac去/private/etc路径下给hosts添加这几行（Windows在C:\WINDOWS\system32\drivers\etc）
127.0.0.1 eureka-server
127.0.0.1 eureka-server-2
127.0.0.1 eureka-server-3
添加完这三行，拉下来项目直接启动就好了，接下来的测试就小问题了：
这里配置了3个Eureka注册中心，2个服务提供者，1个服务消费者（其实在Eureka中不区分提供者和消费者，统一称为Eureka客户端）
注册中心：
  eureka-server-center
  eureka-server-center-2
  eureka-server-center-3
提供者：
  service-producer
  service-producer2
消费者：
  service-consumer-ribbon

搭建demo还有好多小坑，但是我都解决了，有疑问可以大家一起解决
