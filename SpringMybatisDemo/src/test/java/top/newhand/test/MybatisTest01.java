package top.newhand.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.newhand.bean.User;
import top.newhand.config.SpringConfig;
import top.newhand.dao.UserMapper;

import java.util.List;

/**
 * @ClassName MybatisTest01
 * @Author HeXianGang
 * @Date 2024/3/8 20:07
 * @Version 1.0
 * @Description Mybatis测试类
 **/

@RunWith(SpringJUnit4ClassRunner.class)
//【第三步】加载配置文件或者配置类
@ContextConfiguration(classes = {SpringConfig.class})
public class MybatisTest01 {

    @Autowired
    private UserMapper userMapper;

    //从MySQL中查询所有的用户
    @Test
    public void test01() throws Exception{
        List<User> allUsers = userMapper.findAllUsers();
        for (User user : allUsers) {
            System.out.println(user);
        }
    }
    
}
