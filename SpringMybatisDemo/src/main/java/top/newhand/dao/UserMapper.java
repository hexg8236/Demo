package top.newhand.dao;

import top.newhand.bean.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Author HeXianGang
 * @Date 2024/3/8 20:03
 * @Version 1.0
 * @Description UserMapper接口
 **/

public interface UserMapper {
    
    /**
     * @Description 查询所有ID
     * @Param []
     * @Date 20:04 2024/3/8
     **/
    List<User> findAllUsers();

    User findUserById(Integer id);

    //添加
    void saveUser(User user);

    //修改
    void updateUser(User user);

    //根据id删除
    void deleteUser(Integer id);
}
