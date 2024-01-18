package top.newhand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.newhand.pojo.User;

/**
 * @ClassName ResponseController
 * @Author hexg8
 * @Date 2024/1/18 14:52
 * @Version 1.0
 * @Description TODO
 **/

@Controller
public class ResponseController {
    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        return "hello, Springmvc";
    }

    @RequestMapping("/toJson")
    @ResponseBody
    public User toJson() {
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        return user;
    }
}
