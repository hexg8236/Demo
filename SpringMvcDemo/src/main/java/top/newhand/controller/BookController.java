package top.newhand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName BookController
 * @Author hexg8
 * @Date 2024/1/16 21:34
 * @Version 1.0
 * @Description TODO
 **/
@Controller
public class BookController {

    @RequestMapping("/book/save")
    @ResponseBody
    public String save() {
        System.out.println("book save...");
        return "{'module': 'book save'}";
    }

}
