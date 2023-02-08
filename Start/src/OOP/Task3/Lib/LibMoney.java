package OOP.Task3.Lib;

import OOP.Task3.entity.enums.Currency;
import OOP.Task3.entity.enums.CurrencySymbol;
import OOP.Task3.entity.enums.Kopecks;

public class LibMoney {
    public static Kopecks GetKopeck(Currency currency){
        switch (currency){
            case EUR: return Kopecks.eurocents;
            case USD: return Kopecks.cents;
            default: return Kopecks.kopecks;
        }
    }
    public static CurrencySymbol GetCurrencySymbol(Currency currency){
        switch (currency){
            case EUR: return CurrencySymbol.€;
            case USD: return CurrencySymbol.$;
            default: return CurrencySymbol.₴;
        }
    }
}
