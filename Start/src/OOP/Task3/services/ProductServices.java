package OOP.Task3.services;

import OOP.Task3.entity.models.Product;

public class ProductServices {
    public static void showProduct(Product product) {
        System.out.printf("Product: %s\n" +
                "Price: %d. %d %s", product.getName(), product.getMoney(), product.getKopeck(), product.getCurrency());
    }

    public static void setPrice(Product product, int money, int kopecks) {
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
