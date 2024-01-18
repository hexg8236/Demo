package top.newhand.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileController
 * @Author hexg8
 * @Date 2024/1/17 11:15
 * @Version 1.0
 * @Description TODO
 **/
@Controller
public class FileController {
    @RequestMapping("/fileParam")
    @ResponseBody
    public String fileParam(MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                file.transferTo(new File("D://test.txt"));
            } catch (IOException e) {
                 e.printStackTrace();
            }
        }
        return "{'module':'file'}";
    }
}
