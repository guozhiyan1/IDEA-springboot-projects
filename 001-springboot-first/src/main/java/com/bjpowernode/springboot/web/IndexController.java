package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.config.School;
import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller  //注解是个控制层
public class IndexController{
    @Value("${school.name}")
    private String schoolName;
    @Autowired  //注入
    private School school;

    @RequestMapping(value="/springboot/say")
    public @ResponseBody Object say(String message){
        return "hello," + message+schoolName+school.getName();
    }

    @RequestMapping(value="/mapvalue")
    @ResponseBody
    public Map<String,Object> mapvalue(){
        Map<String,Object> retMap = new HashMap<String,Object>();
        retMap.put("message","SpringBoot Project");
        return retMap;
    }
    @Autowired
    private UserService userService;//业务接口层
    @RequestMapping(value="/user")
    public @ResponseBody Object user(Integer id){
        User user=userService.queryUserById(id);
       return user;
    }
    @RequestMapping(value="/update")
    @ResponseBody
    public Object change(Integer id,String name){
        User user=new User();
        user.setId(id);
        user.setUsername(name);
        int count=userService.updateSelective(user);
        return "修改结果："+count;
    }

}


