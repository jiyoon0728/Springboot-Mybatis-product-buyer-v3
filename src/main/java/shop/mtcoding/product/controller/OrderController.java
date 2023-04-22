package shop.mtcoding.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/ordersList")
    public String orderListForm() {
        return "orders/ordersList";
    }

}