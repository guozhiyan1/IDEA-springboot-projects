package com.bjpowernode.springboot.mapper;

import com.bjpowernode.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper //扫码dao接口到spring容器也可以在application中用mapperscan批量扫描
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);
    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    int updateSelective(User user);
}