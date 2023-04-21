package shop.mtcoding.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // 메인페이지가 로그인 페이지
    @GetMapping({ "/", "/loginForm" })
    public String loginForm() {
        return "user/loginForm";
    }


    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }
}