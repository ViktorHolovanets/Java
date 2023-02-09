package OOP.Task3.services;

import OOP.Task3.entity.models.Product;

public class ProductServices {
    private Product product;
    public ProductServices(Product pr){
        product=pr;
    }
    public  void showProduct() {
        System.out.printf("Product: %s\n" +
                "Price: %d. %d %s", product.getName(), product.getMoney(), product.getKopeck(), product.getCurrency());
    }

    public void setPrice( int money, int kopecks) {
        money = Math.abs(money);
        kopecks = Math.abs(kopecks);
        if (kopecks > 99) {
            money += kopecks / 100;
            kopecks %= 100;
        }
        product.setMoney(money);
        product.setKopeck(kopecks);
    }
}
