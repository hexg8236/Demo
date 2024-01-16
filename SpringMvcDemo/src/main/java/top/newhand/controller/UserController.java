package top.newhand.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.newhand.pojo.User;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName UserController
 * @Author hexg8
 * @Date 2024/1/14 16:08
 * @Version 1.0
 * @Description TODO
 **/
@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/save", method = RequestMethod.GET)
    @ResponseBody
    public String save(@RequestParam("name") String username, Integer age) {
        System.out.println("Name:" + username);
        System.out.println("Age:" + age);
        System.out.println("User Save");
        return "{'module':'user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user Delete");
        return "{'module': 'user delete'}";
    }


    @RequestMapping("pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo参数传递 user === 》 " + user.toString());
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getAddress().getCity());
        System.out.println(user.getAddress().getProvince());
        return "{'module': pojo param}";
    }


    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传递 likes: " + Arrays.toString(likes));
        return "{'module': 'array param'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        // 请求方法为public String listParam(List<String> likes) 时报错： java.lang.NoSuchMethodException: java.util.List.<init>()
        // 这是因为SpringMvc将list看做Pojo对象来处理，将其创建一个对象并准备把前端的数据封装到对象中，但是List是一个接口，无法创建对象所以报错
        // 修改为 public String listParam(@RequestParam List<String> likes)  错误消失
        System.out.println("集合参数传递 likes ==>" + likes);
        return "{'module': 'list param'}";
    }

    @RequestMapping("/mapParam")
    @ResponseBody
    public String mapParam(@RequestParam Map<String, String> maps) {
        System.out.println(maps);
        return "{'module': 'map param'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date, @DateTimeFormat(pattern = "yyyy-mm-dd") Date date2, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date3 ) {
        System.out.println("date:" + date);
        System.out.println("date2:" + date2);
        System.out.println("date3:" + date3);
        return "{'module': 'date Param'}";
    }
}
