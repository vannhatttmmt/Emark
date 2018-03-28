package application.viewmodel.product;

import application.model.ProductDetailModel;
import application.viewmodel.common.LayoutHeaderVM;

public class ProductIndexModelVM extends LayoutHeaderVM{
    private ProductDetailModel productDetails;

    public ProductDetailModel getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetailModel productDetails) {
        this.productDetails = productDetails;
    }
}
