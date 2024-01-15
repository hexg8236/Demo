package top.newhand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Author hexg8
 * @Date 2024/1/14 16:08
 * @Version 1.0
 * @Description TODO
 **/
@Controller
public class UserController {


    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("User Save");
        return "SpringMvc";
    }
}
