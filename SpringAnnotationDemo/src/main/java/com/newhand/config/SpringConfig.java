package com.newhand.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName SpringConfig
 * @Author hexg8
 * @Date 2024/1/10 21:07
 * @Version 1.0
 * @Description TODO Spring配置类
 **/
@Configuration
@ComponentScan("com.newhand")
@Import(JdbcConfig.class)
public class SpringConfig {
}
