package OOP.Task3.entity.models;

import OOP.Task3.Lib.LibMoney;
import OOP.Task3.entity.enums.Currency;
import OOP.Task3.entity.enums.Kopecks;
import lombok.Data;

@Data
public class Money {
    protected Currency currency;
    protected Kopecks kopecks;
    protected Integer money;
    protected Integer kopeck;

    public Money(Currency currency, Integer money, Integer kopeck) {
        this.currency = currency;
        this.money = money;
        this.kopeck = kopeck;
        this.kopecks = LibMoney.GetKopeck(currency);
    }
}
