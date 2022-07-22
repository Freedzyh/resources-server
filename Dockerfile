###指定java8环境镜像
FROM java:8
 
### 指定存储在容器内的目录
WORKDIR  /usr/local/custom/zhuyuhua
 
### 复制 jar (docker-springboot-0.0.1.jar) 到容器中并命名为 app-springboot.jar
ADD ./resources-server.jar  ./resources.jar
 
###声明启动端口号
EXPOSE 9286
 
###配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","resources.jar"]
