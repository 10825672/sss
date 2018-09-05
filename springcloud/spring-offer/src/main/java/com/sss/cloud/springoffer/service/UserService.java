package com.sss.cloud.springoffer.service;


import com.sss.cloud.springoffer.entity.User;
import java.util.List;

/**
 * 
 * @author auto create
 * @param <User>
 * @since 1.0,2018-09-03 19:46:40
 */
public interface UserService {
    /**
    *@方法名: insertSelective
    *@方法描述: 根据对象插入单条记录
    *@param user
    *@返回值 Integer 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public Integer insertSelective(User user) throws Exception;

    /**
    *@方法名: insertBatch
    *@方法描述: 根据对象批量插入记录
    *@param user
    *@返回值 Integer 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public Integer insertBatch(List<User> user) throws Exception;

    /**
    *@方法名: deleteByPrimaryKey
    *@方法描述: 根据主键删除单条记录
    *@param user
    *@返回值 Integer 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public Integer deleteByPrimaryKey(Object id);

    /**
    *@方法名: deleteBatchByPrimaryKey
    *@方法描述: 根据主键批量删除
    *@param user
    *@返回值 Integer 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public Integer deleteBatchByPrimaryKey(List<Object> ids);

    /**
    *@方法名: updateByPrimaryKeySelective
    *@方法描述: 根据主键选择更新单个对象
    *@param user
    *@返回值 Integer 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public Integer updateByPrimaryKeySelective(User user);

    /**
    *@方法名: findById
    *@方法描述: 根据id 查询对象
    *@param user
    *@返回值 对象 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public User findById(Object id);

    /**
    *@方法名: selectByCondition
    *@方法描述: 分条件查询对象
    *@param user
    *@返回值 List<User> 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public List<User> selectByCondition(User user);

    /**
    *@方法名: selectCountByCondition
    *@方法描述: 分条件查询对象总数
    *@param user
    *@返回值 Integer 返回类型
    *@作者：hycx
    *@创建时间 2018年09月03日 19:46:40
    *@修改时间 2018年09月03日 19:46:40
    *@版本 V1.0
    *@异常
    **/
    public Integer selectCountByCondition(User user);


}
