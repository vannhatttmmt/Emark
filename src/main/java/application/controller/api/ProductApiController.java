package application.controller.api;

import application.data.model.Product;
import application.data.service.ProductService;
import application.model.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductApiController {

    @Autowired
    private ProductService productService;


    @PostMapping("/create-product")
    public BaseApiResult createProduct(@RequestBody ProductDataModel product) {
        DataApiResult result = new DataApiResult();

        try {
            if (!"".equals(product.getName()) && !"".equals(product.getPrice()) &&
                    !"".equals(product.getShortDesc()) && !"".equals(product.getImage())) {
                ModelMapper modelMapper = new ModelMapper();
                Product productEntity = modelMapper.map(product, Product.class);
                productService.addNewProduct(productEntity);
                result.setSuccess(true);
                result.setMessage("Save product successfully");
                result.setData(productEntity);
            } else {
                result.setSuccess(false);
                result.setMessage("Invalid model");
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }

        return result;
    }

    @GetMapping("/detail/{productId}")
    public BaseApiResult detailProduct(@PathVariable int productId) {
        DataApiResult result = new DataApiResult();

        try {
            Product existProduct = productService.findOne(productId);
            if (existProduct == null) {
                result.setSuccess(false);
                result.setMessage("Product Not Found");
            } else {
                result.setSuccess(true);
                result.setMessage("Found");
                ModelMapper modelMapper = new ModelMapper();
                ProductDetailModel productDetailModel = modelMapper.map(existProduct, ProductDetailModel.class);
                result.setData(productDetailModel);
            }
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @PostMapping("/delete-product")
    public BaseApiResult deleteProduct(@RequestBody ProductDeleteDataModel product){
        BaseApiResult result = new BaseApiResult();
        try {
            if (productService.deleteProduct(product.getId())){
                result.setSuccess(true);
                result.setMessage("Delete Product Successfully!");
            }
        } catch (Exception e){
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }

    @PostMapping("/update-product/{productId}")
    public BaseApiResult updateProduct(@PathVariable int productId, @RequestBody ProductDataModel product){
        DataApiResult result = new DataApiResult();

        try{
            if (!"".equals(product.getName()) && !"".equals(product.getPrice()) &&
                    !"".equals(product.getShortDesc()) && !"".equals(product.getImage())){
                Product existProduct = productService.findOne(productId);
                if (existProduct == null){
                    result.setSuccess(false);
                    result.setMessage("Invalid Product");
                } else {
                    existProduct.setName(product.getName());
                    existProduct.setImage(product.getImage());
                    existProduct.setPrice(product.getPrice());
                    existProduct.setShortDesc(product.getShortDesc());
                    existProduct.setCreatedDate(product.getCreatedDate());
                    productService.updateProduct(existProduct);
                    result.setSuccess(true);
                    result.setMessage("SUCCESS TO UPDATE PRODUCT!");
                    result.setData(product);
                }
            } else {
                result.setSuccess(false);
                result.setMessage("Invalid Product");
            }
        } catch (Exception e){
            result.setSuccess(false);
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
