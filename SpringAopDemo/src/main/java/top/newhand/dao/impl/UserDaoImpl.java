package top.newhand.dao.impl;

import org.springframework.stereotype.Repository;
import top.newhand.dao.UserDao;

/**
 * @ClassName UserDaoImpl
 * @Author hexg8
 * @Date 2024/1/12 11:29
 * @Version 1.0
 * @Description TODO
 **/
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("book dao Save ...");
    }
}
