package application.controller;

import application.data.model.HomePage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Random;

@Controller
@RequestMapping(path = "/")
public class ProductController {

    private String[] images = {
            "https://cdn.tgdd.vn/Products/Images/42/114111/iphone-x-256gb-400-460copy-400x460.png",
            "https://cdn.tgdd.vn/Products/Images/42/114114/iphone-8-plus-256gb2-400x460.png",
            "https://cdn.tgdd.vn/Products/Images/42/93713/iphone-7-plus-red-256gb-400x460.png",
            "https://cdn.tgdd.vn/Products/Images/42/60546/iphone-5s-16gb-7-400x460.png"
    };

    private String[] slideImage1 = {
            "https://cf.shopee.vn/file/82d21b7448df66308e3939feecbc8071",
            "https://cf.shopee.vn/file/ef0be1c311fd07e29480e619b88c0d70",
            "https://cf.shopee.vn/file/2c9a0c4c2992e07c11f4d322d912dc67"
    };

    private String[] slideImage2 = {
            "https://cf.shopee.vn/file/f829d0f5251adfa5901690b18dddb23e",
            "https://cf.shopee.vn/file/f88face02ca0734bc917baeef184e658",
            "https://cf.shopee.vn/file/63279b7bb6ebc5c12322b78c988fe378"
    };

    private String[] slideImage3 = {
            "https://cf.shopee.vn/file/864ed556604ddce683a66d57ac88df9d",
            "https://cf.shopee.vn/file/14f5b57b5c54765c5cff84ce7d159fe8",
            "https://cf.shopee.vn/file/578c91a03f64d5cba32c005e744bdde3"
    };
    private String[] priceList = {
            "29.900.000 VND",
            "24.450.000 VND",
            "19.900.000 VND",
            "9.900.000 VND"
    };
    private String[] navMenuName = {
            "Home",
            "Phone",
            "Tablet",
            "Laptop",
            "Desktop"
    };
    private String[] navMenuLink = {
            "http://google.com"
    };


    @GetMapping(path = "/product-details")
    public String product(Model model) {
        return "product";
    }
}
