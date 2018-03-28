package application.controller.web;

import application.data.model.Product;
import application.data.repository.ProductRepository;
import application.data.service.ProductService;
import application.model.ProductDetailModel;
import application.viewmodel.product.ProductIndexModelVM;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;

@Controller
@RequestMapping(path = "/product")
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/detail/{productId}")
    public String product(Model model, @PathVariable int productId) {

        ProductIndexModelVM vm = new ProductIndexModelVM();
        Product existProduct = productService.findOne(productId);
        if (existProduct != null) {
            ModelMapper modelMapper = new ModelMapper();
            ProductDetailModel productDetailModel = modelMapper.map(existProduct, ProductDetailModel.class);
            vm.setProductDetails(productDetailModel);

            model.addAttribute("vm", vm);
            return "product/productindex";
        } else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }
}
