package application.controller.web;

import application.data.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/product")
public class ProductController {

    private ProductRepository productRepository;

    @GetMapping(path = "")
    public String product() {
        return "product/productindex";
    }
}
