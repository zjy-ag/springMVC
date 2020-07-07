package top.zhujiayu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zjy
 * @date 2020/7/7
 **/

@RestController
public class TestController {

    @GetMapping("/test")
    public String text() {
        System.out.println("test");
        return "test";
    }


}
