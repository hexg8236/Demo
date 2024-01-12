package top.newhand.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName SpringConfig
 * @Author hexg8
 * @Date 2024/1/12 11:31
 * @Version 1.0
 * @Description TODO
 **/
@Configuration
@ComponentScan("top.newhand")
@EnableAspectJAutoProxy
public class SpringConfig {
}
