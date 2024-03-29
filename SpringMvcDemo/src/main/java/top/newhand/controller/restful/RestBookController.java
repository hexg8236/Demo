package top.newhand.controller.restful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.newhand.pojo.Book;

/**
 * @ClassName BookController
 * @Author hexg8
 * @Date 2024/1/18 15:01
 * @Version 1.0
 * @Description TODO
 **/
@Controller
public class RestBookController {

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody Book book) {
        System.out.println("book save.." + book);
        return "{'module': 'book save'}";
    }

    @RequestMapping(value = "/books", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody Book book) {
        System.out.println("book update.." + book);
        return "{'module': 'book update'}";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete.." + id);
        return "{'module': 'book delete'}";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id) {
        System.out.println("user getById.." + id);
        return "{'module': 'book getById'}";
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        System.out.println("book findAll");
        return "{'module': 'book findAll'}";
    }
}
