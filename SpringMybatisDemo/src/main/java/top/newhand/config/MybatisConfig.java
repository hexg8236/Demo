package top.newhand.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName MybatisConfig
 * @Author hexg8
 * @Date 2024/1/11 15:48
 * @Version 1.0
 * @Description TODO
 **/
@Configuration
public class MybatisConfig {
    //由于SqlSessionFactoryBean是Mybatis的核心对象，且无状态，创建一次即可，则交由SpringIoc容器管理即可
    //其他Mapper以及实体对象以及有状态对象不建议SpringIoc容器管理，除非特殊对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        // 创建SqlSessionFactoryBean 对象
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        // 设置typeAlias包扫描路径
        sqlSessionFactoryBean.setTypeAliasesPackage("top.newhand");
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
    // 这里是纯注解开发，则Mybatis的配置文件也用注解开发，所以省略Mybatis的配置文件
    // 注意这里引用了 Mybatis-Spring的包，Pom文件里加载了
    // 目前主流框架Spring全家桶，所以其他第三方插件需要自己对Spring兼容配置，而不是Spring对他们进行兼容
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer () {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        // 设置Mybatis扫描路径，一般设置代码的上一层级
        msc.setBasePackage("top.newhand.dao");
        return msc;
    }
}
