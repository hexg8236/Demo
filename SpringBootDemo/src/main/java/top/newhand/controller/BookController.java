package top.newhand.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BookController
 * @Author hexg8
 * @Date 2024/2/2 10:09
 * @Version 1.0
 * @Description TODO
 **/
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id ==>" + id);
        return "hello, Spring boot";
    }
}
