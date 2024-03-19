package top.newhand.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import top.newhand.bean.User;
import top.newhand.dao.UserMapper;

import java.io.InputStream;
import java.util.Date;

/**
 * @ClassName MybatisTest02
 * @Author HeXianGang
 * @Date 2024/3/19 22:08
 * @Version 1.0
 * @Description Mybatis测试
 **/

public class MybatisTest02 {
    @Test
    public void queryById( ) throws Exception {
        //获取mapper接口的动态代理实现

        //1、从xml中构建SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2、获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3、获取UserMapper接口的动态代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.findUserById(1);
        System.out.println("user = " + user);
    }

    private static UserMapper userMapper;
    //在test方法之前先执行的方法
    @BeforeClass
    public static void beforeClass() throws Exception {
        //1、从xml中构建SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //这里指定了环境为test
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream,"test");
        //build不方法不指定环境就使用默认的 <environments default="development">
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2、获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        //3、获取UserMapper接口的动态代理对象
        userMapper = sqlSession.getMapper(UserMapper.class);
    }
    @Test
    public void testFindUserById() throws Exception {
        //获取mapper接口的动态代理实现
        User user = userMapper.findUserById(1);
        System.out.println("user = " + user);
    }

    @Test
    public void testSaveUser () {
        User user = new User();
        user.setUsername("张三");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("上海");
        userMapper.saveUser(user);
    }
}
