package top.newhand.dao.impl;

import org.springframework.stereotype.Repository;
import top.newhand.dao.ResourceDao;

/**
 * @ClassName ResourceDaoImpl
 * @Author hexg8
 * @Date 2024/1/12 21:22
 * @Version 1.0
 * @Description TODO
 **/
@Repository
public class ResourceDaoImpl implements ResourceDao {
    @Override
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        return "root".equals(password);
    }
}
