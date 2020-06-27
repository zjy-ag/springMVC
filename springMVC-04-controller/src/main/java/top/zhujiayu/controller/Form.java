package top.zhujiayu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @auther zjy
* @date 2020/6/27
 **/

@Controller
public class Form {

    @PostMapping("/hello")
    public String form(@RequestParam("name") String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }

    @GetMapping("/h")
    public String hello (Model model) {
        model.addAttribute("msg", "hello");
        return "hello";
    }

}
