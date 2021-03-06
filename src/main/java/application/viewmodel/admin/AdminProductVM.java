package application.viewmodel.admin;

import application.viewmodel.common.LayoutHeaderVM;
import application.viewmodel.common.ProductVM;

import java.util.ArrayList;

public class AdminProductVM extends LayoutHeaderVM{
    private String messageTotalProducts;
    private ArrayList<ProductVM> listPagingProducts;
    private int totalPagingItems;
    private int currentPage;

    public String getMessageTotalProducts() {
        return messageTotalProducts;
    }

    public void setMessageTotalProducts(String messageTotalProducts) {
        this.messageTotalProducts = messageTotalProducts;
    }

    public ArrayList<ProductVM> getListPagingProducts() {
        return listPagingProducts;
    }

    public void setListPagingProducts(ArrayList<ProductVM> listPagingProducts) {
        this.listPagingProducts = listPagingProducts;
    }

    public int getTotalPagingItems() {
        return totalPagingItems;
    }

    public void setTotalPagingItems(int totalPagingItems) {
        this.totalPagingItems = totalPagingItems;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
