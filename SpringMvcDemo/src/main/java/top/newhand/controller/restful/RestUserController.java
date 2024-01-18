package top.newhand.controller.restful;

import org.springframework.web.bind.annotation.*;
import top.newhand.pojo.User;

/**
 * @ClassName UserController
 * @Author hexg8
 * @Date 2024/1/18 15:01
 * @Version 1.0
 * @Description TODO
 **/

// 原生注解 Controller
// @Controller
// 简化注解：RestController相当于： Controller + ResponseBody合成
@RestController
@RequestMapping("/users")
public class RestUserController {
//    简化前注解， 需要两个，简化后直接使用一个即可
//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    @ResponseBody
    @PostMapping
    public String save() {
        System.out.println("user save..");
        return "{'module': 'user save'}";
    }
//    简化前注解， 需要两个，简化后直接使用一个即可
//    @RequestMapping(value = "/users", method = RequestMethod.PUT)
//    @ResponseBody
    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println(" user update.." + user.toString());
        return "{'module': 'user update}";
    }
//    简化前注解， 需要两个，简化后直接使用一个即可
//    @RequestMapping(value = "/users/{id}/{name}", method = RequestMethod.DELETE)
//    @ResponseBody
    @DeleteMapping("/{id}/{name}")
    public String delete(@PathVariable Integer id, @PathVariable String name) {
        System.out.println("user delete.." + id + "name = " + name);
        return "{'module': 'user delete'}";
    }
//    简化前注解， 需要两个，简化后直接使用一个即可
//    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById.." + id);
        return "{'module': 'user getById'}";
    }
//    简化前注解， 需要两个，简化后直接使用一个即可
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping
    public String getAll() {
        System.out.println("user getAll..");
        return "{'module': 'user getAll'}";
    }
}
