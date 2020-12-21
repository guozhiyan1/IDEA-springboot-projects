package com.bjpowernode.springboot.service.impl;

import com.bjpowernode.springboot.mapper.UserMapper;
import com.bjpowernode.springboot.model.User;
import com.bjpowernode.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired//调用数据持久层
    private UserMapper userMapper;
    @Override
    public User queryUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
    @Override
    public int updateSelective(User user){
        int i=userMapper.updateSelective(user);
                return i;
    }
}
