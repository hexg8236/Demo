package com.newhand.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.newhand.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @ClassName JdbcConfig
 * @Author hexg8
 * @Date 2024/1/10 21:50
 * @Version 1.0
 * @Description TODO
 **/
@Configuration
// 加载静态资源文件路径
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {

    // 默认值注入
    //@Value("com.mysql.jdbc.Driver")
    // 使用properties文件中的值注入
    @Value("${jdbc.driver}")
    private String driver;

    //@Value("jdbc:mysql://192.168.222.128:3306")
    @Value("${jdbc.url}")
    private String url;

    //@Value("root")
    @Value("${jdbc.username}")
    private String username;

    //@Value("Aa123456")
    @Value("${jdbc.password}")
    private String password;

    // 当前方法的返回值是一个bean对象，添加到IOC容器中
    // Bean对象以方法名称为对象名称
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
