package top.zhujiayu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @auther zjy
 * @date 2020/7/7
 **/

// 未完成
@Controller
public class LoginController {

    @GetMapping("/login")
    public String main() {
        return "/login";
    }

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        if ("root".equals(username) && "123456".equals(password)) {
            session.setAttribute("user", username);
        }
        return "/success";
    }

}
