package com.bjpowernode.springboot.service;

import com.bjpowernode.springboot.model.User;

/**
 * 根据id查询用户信息
 */
public interface UserService {
    User queryUserById(Integer id);
    int updateSelective(User user);
}
