package top.newhand.feign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.newhand.feign.pojo.User;


/**
 * @ClassName UserClient
 * @Author HeXianGang
 * @Date 2024/3/7 21:38
 * @Version 1.0
 * @Description 引用Fiegn的接口
 **/
@FeignClient("userservice")
public interface UserClient {


    /**
     * @Description 获取用户Id
     * @Param [id]
     * @Date 21:41 2024/3/7
     **/
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
