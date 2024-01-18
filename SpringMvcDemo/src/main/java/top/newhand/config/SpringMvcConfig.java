package top.newhand.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @ClassName SpringMvcConfig
 * @Author hexg8
 * @Date 2024/1/14 16:10
 * @Version 1.0
 * @Description TODO
 **/

@Configuration
@ComponentScan("top.newhand")
// 开启Json数据类型自动转换
@EnableWebMvc
public class SpringMvcConfig {

    @Bean("multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
        resolver.setDefaultEncoding("UTF-8");
        resolver.setMaxUploadSize(1024*1024);
        return resolver;
    }


}
