package org.example.dao;


import org.example.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    // insert一个用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);


    // 模糊查询
    List<User> getUserLike(String value);
}
