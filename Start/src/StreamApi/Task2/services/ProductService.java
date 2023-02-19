package StreamApi.Task2.services;

import StreamApi.Task2.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductService {
    private ArrayList<Product> Products;
    private Stream<Product> productStream;

    public ProductService(ArrayList<Product> products) {
        this.Products = products;
        productStream = Products.stream();
    }

    public ArrayList<Product> getProducts(ArrayList<Product> products) {
        return this.Products = products;
    }

    public List<Product> lengthName() {
        return Products.stream().filter(pr -> pr.getName().length() < 5).toList();
    }

    public List<Product> getProductWithName(String name) {
        return Products.stream().filter(pr -> pr.getName().equalsIgnoreCase(name)).toList();
    }
    public List<Product> getProductWithNameStart(String name) {
        return Products.stream().filter(pr -> pr.getName().startsWith(name)).toList();
    }
    public List<Product> getProductWithCategoryMilk() {
        return Products.stream().filter(pr -> pr.getCategory()=="Молоко").toList();
    }
}
