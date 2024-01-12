package top.newhand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.newhand.dao.ResourceDao;
import top.newhand.service.ResourceService;

/**
 * @ClassName ResourceServiceImpl
 * @Author hexg8
 * @Date 2024/1/12 21:20
 * @Version 1.0
 * @Description TODO
 **/
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceDao resourceDao;

    @Override
    public boolean openURL(String url, String password) {
        return resourceDao.readResources(url, password);
    }
}
