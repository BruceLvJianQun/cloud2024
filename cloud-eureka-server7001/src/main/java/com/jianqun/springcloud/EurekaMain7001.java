package com.jianqun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @author jianqun
 * @email:1033586391@qq.com
 * @creat 2022-02-17-13:29
 *
 * @EnableEurekaServer:说明这是一个服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        System.out.println("测试Git版本切换等操作进行的第二次提交");
        System.out.println("Hot-fox添加的一些信息进行版本的测试");
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
