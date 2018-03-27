package application.controller.web;

import application.data.model.PaginableItemList;
import application.data.model.Product;
import application.data.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import application.viewmodel.common.ProductVM;
import application.viewmodel.home.BannerVM;
import application.viewmodel.home.HomeLandingVM;


import java.util.ArrayList;


@Controller
@RequestMapping(path = "/")
public class HomeController extends BaseController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/")
    public String homelanding(Model model) {
        HomeLandingVM vm = new HomeLandingVM();
        this.setLayoutHeaderVM(vm);

        ArrayList<BannerVM> listBanner1VM = new ArrayList<>();
        listBanner1VM.add(new BannerVM("/", "/img/carousel/iphonex.png", "Apple Iphone"));
        listBanner1VM.add(new BannerVM("/", "/img/carousel/galaxys9.jpg", "Samsung Galaxy S9"));
        listBanner1VM.add(new BannerVM("/", "/img/carousel/loaharman.jpg", "Loa Harman"));

        ArrayList<BannerVM> listBanner2VM = new ArrayList<>();
        listBanner2VM.add(new BannerVM("/", "/img/carousel/accessory.png", "Phụ kiện hot"));
        listBanner2VM.add(new BannerVM("/", "/img/carousel/iphone6s.jpg", "Iphone 6S"));
        listBanner2VM.add(new BannerVM("/", "/img/carousel/nokia8.jpg", "Nokia 8"));

        ArrayList<BannerVM> listBanner3VM = new ArrayList<>();
        listBanner3VM.add(new BannerVM("/", "/img/carousel/laptop.png", "Laptop hot"));
        listBanner3VM.add(new BannerVM("/", "/img/carousel/xperia.png", "Sony Xperia"));
        listBanner3VM.add(new BannerVM("/", "/img/carousel/oppof5.jpg", "Oppo F5"));


        PaginableItemList<Product> paginableItemListHotProducts = productService.getListProducts(4,0);
        ArrayList<ProductVM> listHotProductsVM = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        for(Product product : paginableItemListHotProducts.getListData()){
            ProductVM productVM = modelMapper.map(product, ProductVM.class);
            listHotProductsVM.add(productVM);
        }

        PaginableItemList<Product> paginableItemListHotPhones = productService.getListProducts(4,1);
        ArrayList<ProductVM> listHotPhonesVM = new ArrayList<>();
        for (Product product : paginableItemListHotPhones.getListData()){
            ProductVM productVM = modelMapper.map(product, ProductVM.class);
            listHotPhonesVM.add(productVM);
        }

        PaginableItemList<Product> paginableItemListHotTablets = productService.getListProducts(4,2);
        ArrayList<ProductVM> listHotTabletsVM = new ArrayList<>();
        for (Product product : paginableItemListHotTablets.getListData()){
            ProductVM productVM = modelMapper.map(product, ProductVM.class);
            listHotTabletsVM.add(productVM);
        }

        PaginableItemList<Product> paginableItemListHotLaptops = productService.getListProducts(4,3);
        ArrayList<ProductVM> listHotLaptopsVM = new ArrayList<>();
        for (Product product : paginableItemListHotLaptops.getListData()){
            ProductVM productVM = modelMapper.map(product, ProductVM.class);
            listHotLaptopsVM.add(productVM);
        }

        PaginableItemList<Product> paginableItemListHotAccessories = productService.getListProducts(4,4);
        ArrayList<ProductVM> listHotAccessoriesVM = new ArrayList<>();
        for (Product product : paginableItemListHotAccessories.getListData()){
            ProductVM productVM = modelMapper.map(product, ProductVM.class);
            listHotAccessoriesVM.add(productVM);
        }

        vm.setBanner1(listBanner1VM);
        vm.setBanner2(listBanner2VM);
        vm.setBanner3(listBanner3VM);
        vm.setListHotProducts(listHotProductsVM);
        vm.setListHotPhones(listHotPhonesVM);
        vm.setListHotTablets(listHotTabletsVM);
        vm.setListHotLaptops(listHotLaptopsVM);
        vm.setListHotAccessories(listHotAccessoriesVM);

        model.addAttribute("vm", vm);
        return "index";
    }
}
