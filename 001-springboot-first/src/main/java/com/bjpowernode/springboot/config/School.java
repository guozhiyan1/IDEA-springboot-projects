package com.bjpowernode.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component //将此类给spring容器进行管理
@ConfigurationProperties(prefix ="school")//配置属性注解，必须有前缀
public class School {
    private String name;
    private String website;

    public String getName(){
    return  name;
    }
    public void setName(String name){
        this.name=name;
    }
}
