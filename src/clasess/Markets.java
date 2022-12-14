package clasess;

import enums.EnumProduct;

import java.math.BigDecimal;
import java.util.List;

public class Markets {
    private String nameMarket;
    private List<Product> products;
    private long cashAccount;
    private long cardAccount;


    public Markets(String nameMarket, List<Product> products, long cashAccount, long cardAccount) {
        this.nameMarket = nameMarket;
        this.products = products;
        this.cashAccount = cashAccount;
        this.cardAccount = cardAccount;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public long getCashAccount() {
        return cashAccount;
    }

    public void setCashAccount(long cashAccount) {
        this.cashAccount = cashAccount;
    }

    public long getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(long cardAccount) {
        this.cardAccount = cardAccount;
    }

    @Override
    public String toString() {
        return "\n\t________________" +
                "\n\t|>Market " + nameMarket + "<|" +
                "\n\t^^^^^^^^^^^^^^^^" +
                "\n\tProducts " + products +
                "\n|>>>> Market Accounts <<<<" + "|" +
                "\n|Cash Account :" + cashAccount + "\t\t  |" +
                "\n|Card Account :" + cardAccount + "\t\t  |" +
                "\n|.........................|";
    }
}
