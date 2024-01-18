package top.newhand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.newhand.pojo.User;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName JsonController
 * @Author hexg8
 * @Date 2024/1/17 11:35
 * @Version 1.0
 * @Description TODO
 **/
@Controller
public class JsonController {
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println(user);
        return "{'module': 'pojoParamJson'}";
    }

    @RequestMapping("/arrayParamForJson")
    @ResponseBody
    public String arrayParamForJson(@RequestBody String[] likes) {
        System.out.println(Arrays.toString(likes));
        return "{'module': 'arrayParamForJson'}";
    }


    @RequestMapping("/arrayPojoParamForJson")
    @ResponseBody
    public String arrayPojoParamForJson(@RequestBody List<User> list) {
        System.out.println(list);
        return "{'module': 'arrayPojoParamForJson'}'";
    }
}
