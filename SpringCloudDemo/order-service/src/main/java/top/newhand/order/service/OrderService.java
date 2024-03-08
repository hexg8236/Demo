package top.newhand.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.newhand.order.mapper.OrderMapper;
import top.newhand.order.pojo.Order;
import top.newhand.order.pojo.User;
import top.newhand.order.web.UserClient;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        // 2、远程查询user
        //String url = "http://localhost:8090/user/" + order.getUserId();
        // 修改请求路径为微服务注册路径
        String url = "http://userservice/user/" + order.getUserId();
        // 2.2 发起调用
        //User forObject = restTemplate.getForObject(url, User.class);
        // 利用Feign发起http请求，查询用户
        User user = userClient.findById(order.getUserId());
        // 3、 存入order
        order.setUser(user);
        // 4.返回
        return order;
    }


}
