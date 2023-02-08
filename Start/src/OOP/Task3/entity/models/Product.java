package OOP.Task3.entity.models;

import OOP.Task3.entity.enums.Currency;
import lombok.Data;

@Data
public class Product extends Money{
    public Product(Currency currency, Integer money, Integer kopeck) {
        super(currency, money, kopeck);
    }
    private Product() {
        super(Currency.UAH,0,0);
    }
    private String name;
}
