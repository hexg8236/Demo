package top.newhand.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName SqlSessionUtil
 * @Author HeXianGang
 * @Date 2024/3/19 22:02
 * @Version 1.0
 * @Description SQLSessionUtil工具类
 **/

@SuppressWarnings("all")
public class SqlSessionUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 实例化工厂构造类
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")){
            //创建工厂
            sqlSessionFactory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @description TODO 获取SQLSession 自动提交事务
     * @date 2024/3/19 22:05
     * @return org.apache.ibatis.session.SqlSession
     */
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession(true);
    }

    /**
     * 得到会话对象
     *
     * @param isAutoCommit 是否自动提交事务
     */
    public static SqlSession getSession(boolean isAutoCommit) {
        return sqlSessionFactory.openSession(isAutoCommit);
    }

    /*
     *   提交事务并关闭session
     * */
    public static void commitAndClose(SqlSession session) {
        if (session != null) {
            session.commit();
            session.close();
        }
    }

    /*
     *   回滚事务并关闭session
     * */
    public static void rollbackAndClose(SqlSession session) {
        if (session != null) {
            session.rollback();
            session.close();
        }
    }

}
