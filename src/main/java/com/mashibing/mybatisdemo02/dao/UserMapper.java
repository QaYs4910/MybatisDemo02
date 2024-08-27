package com.mashibing.mybatisdemo02.dao;

import com.mashibing.mybatisdemo02.pojo.User;
import com.mashibing.mybatisdemo02.pojo.UserWrapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int addUser(User user);

    User query(@Param("id") Integer id);

    //多参数设置
    int updateUser(@Param("username") String username,@Param("id") Integer id);

    int addUserWrapper(UserWrapper userWrapper);

    List<User> allUser();

    List<User> queryUser(User user);

    List<User> queryChoose(User user);

    void updateUser1(User user);

    List<User> queryByIds(@Param("ids") List<Integer> ids);

    Integer insertUser(@Param("users") List<User> users);
}
