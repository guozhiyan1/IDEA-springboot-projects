package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//SpringBoot项目启动入口类
@SpringBootApplication   //开启配置核心注解
public class Application {
//该类同级或下级目录
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
