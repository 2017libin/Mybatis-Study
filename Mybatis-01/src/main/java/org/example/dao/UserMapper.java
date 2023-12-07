package org.example.dao;


import org.example.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();

    // 根据ID查询用户
    User getUserById(int id);

    // insert一个用户
    int addUser(User user);

    // 万能的Map
    int addUser2(Map<String,Object> map);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);


    // 模糊查询
    List<User> getUserLike(String value);
}
