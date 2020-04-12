# spring-cloud-demo
Spring Cloud的学习案例程序,主要包含一下内容
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200406160359812.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dyb25neWFv,size_16,color_FFFFFF,t_70#pic_center)

### 1. Eureka Server
EureKa Server注册中心集群搭建，服务提供者都向Server注册，消费者从Server获取服务地址，便于服务管理和服务发现

### 2. Eureka Provider
真正的业务服务的提供者，需要将自己注册到Eureka Server中，便于其它消费者调用；一般来说服务提供者也是服务消费者

### 3. Eureka Consumer
服务消费者从Eureka Server获取服务提供者的地址，通过Ribbon或Feign调用，同时可以结合Hystrix做服务熔断

### 4. Zuul
微服务搭建完成以后，放于内网中，由zuul网关对微服务进行路由转发，同时结合Ribbon提供负载均衡，结合Hystrix做服务熔断

### 5. Spring Cloud Conifg
所有微服务的配置集中统一管理，通过Config Server做统一交互，Config Client可以从Config Server获取指定的配置文件
Config Server将自己注册到Eureka Server中，Config Client（一般来说具体某个微服务）可以从Eureka Server获取具体的某一个Config Server

### 6. Spring Cloud Bus
Bus总线，用来广播一些需要让其他连接在该主题上的实例都知道的消息，配合Spring Cloud Config实现微服务应用配置信息的动态更新

### 7. Sleuth
Redis+ELK实现日志收集，提供快速日志查询，zipkin查询各个链路耗时
