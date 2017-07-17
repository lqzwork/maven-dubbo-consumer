# maven-dubbo-consumer
dubbo分布式消费者工程

启动consumer条件：

1、启动两个zookeeper

在zookeeper的配置文件zoo.cfg里面修改clientPort=2181，第一次启动后，把这个clientPort=2181改为clientPort=2182再启动一次zookeeper

2、启动两个提供者服务

StartDubboProvider.java和StartDubboProvider2.java

3、最后在Tomcat中启动consumer服务

4、测试访问地址为：localhost:8080/consumer/dubbo