package top.newhand.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName SpringConfig
 * @Author hexg8
 * @Date 2024/1/11 15:41
 * @Version 1.0
 * @Description TODO
 **/
@Configuration
@ComponentScan("top.newhand")
@Import({MybatisConfig.class, JdbcConfig.class})
public class SpringConfig {
}
