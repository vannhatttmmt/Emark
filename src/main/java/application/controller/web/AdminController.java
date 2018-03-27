package application.controller.web;

import application.data.model.PaginableItemList;
import application.data.model.Product;
import application.data.service.ProductService;
import application.viewmodel.admin.AdminProductVM;
import application.viewmodel.common.ProductVM;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(path = "/admin", method = RequestMethod.GET)
public class AdminController extends BaseController {

    @Autowired
    private ProductService productService;


    @GetMapping(path = "")
    public  String admin(Model model){
        AdminProductVM vm = new AdminProductVM();
        this.setLayoutHeaderVM(vm);
        int totalProducts = (int)productService.getTotalProducts();

        PaginableItemList<Product> listTotalProducts = productService.getListProducts(totalProducts, 0);
        ArrayList<ProductVM> listTotalProductsVM = new ArrayList<>();
        for (Product product : listTotalProducts.getListData()){
            ModelMapper modelMapper = new ModelMapper();
            ProductVM productVM = modelMapper.map(product, ProductVM.class);
            listTotalProductsVM.add(productVM);
        }
        vm.setListTotalProducts(listTotalProductsVM);
        model.addAttribute("vm", vm);
        model.addAttribute("total", "Total Exist Products: "+ totalProducts);
        return "admin";
    }
}
