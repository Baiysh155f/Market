package clasess;

import java.math.BigDecimal;

public class Person {
    private String name;
    private long cashPay;
    private String password;
    private long cardPay;

    public Person(String name, long cashPay, String password, long cardPay) {
        this.name = name;
        this.cashPay = cashPay;
        this.password = password;
        this.cardPay = cardPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCashPay() {
        return cashPay;
    }

    public void setCashPay(long cashPay) {
        this.cashPay = cashPay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCardPay() {
        return cardPay;
    }

    public void setCardPay(long cardPay) {
        this.cardPay = cardPay;
    }

    @Override
    public String toString() {
        return "\nName :" + name +
                "\nCash Account :" + cashPay +
                "\nCard :" + password +
                "\nCard Account :" + cardPay +
                "\n..................";
    }
}
