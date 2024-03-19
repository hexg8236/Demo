package top.newhand.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.newhand.bean.User;
import top.newhand.config.SpringConfig;
import top.newhand.dao.UserMapper;

import java.io.IOException;
import java.io.InputStream;
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

    @Test
    public void test02() throws IOException {
        // 1、从xml文件中构建SQLSessionFactoryB
        String resource = "mybatis-config.xml";
        // 加载核心配置文件获取输入流
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        // 2、从SQLSessionFactory中获取Session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3、使用Session获取接口的动态代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 查询
        List<User> allUsers = mapper.findAllUsers();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }

        User userById = mapper.findUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }
    
}
