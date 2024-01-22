package com.automated.trading.stock.StockManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String defaultPage() {
        return "default";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
