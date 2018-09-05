package com.sss.cloud.springoffer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sss.cloud.springoffer.dao.UserMapper;
import com.sss.cloud.springoffer.entity.User;
import com.sss.cloud.springoffer.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper<User>userMapper;
    
    @Override
    public Integer insertSelective(User user) throws Exception {
           return this.userMapper.insertSelective(user);
        }

    @Override
    public Integer insertBatch(List<User> user) throws Exception {
           return this.userMapper.insertBatch(user) ;
        }

    @Override
    public Integer deleteByPrimaryKey(Object id) {
            return this.userMapper.deleteByPrimaryKey(id);
    }

    public Integer deleteBatchByPrimaryKey(List<Object> ids) {
           return this.userMapper.deleteBatchByPrimaryKey(ids);
    }

    @Override
    public Integer updateByPrimaryKeySelective(User user) {
           return this.userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User findById(Object id) {
           return (User) this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectByCondition(User user) {
           return (List<User>) this.userMapper.selectByCondition(user);
    }

    @Override
    public Integer selectCountByCondition(User user) {
           return  this.userMapper.selectCountByCondition(user);
    }

}
