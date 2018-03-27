package application.viewmodel.admin;

import application.viewmodel.common.LayoutHeaderVM;
import application.viewmodel.common.ProductVM;

import java.util.ArrayList;

public class AdminProductVM extends LayoutHeaderVM{
    private ArrayList<ProductVM> listTotalProducts;

    public ArrayList<ProductVM> getListTotalProducts() {
        return listTotalProducts;
    }

    public void setListTotalProducts(ArrayList<ProductVM> listTotalProducts) {
        this.listTotalProducts = listTotalProducts;
    }
}
