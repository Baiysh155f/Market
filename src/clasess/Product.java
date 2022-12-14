package clasess;

import enums.EnumProduct;

import java.math.BigDecimal;

public class Product {
    private EnumProduct enumProduct;
    private long price;

    public Product(EnumProduct enumProduct, long price) {
        this.enumProduct = enumProduct;
        this.price = price;
    }

    public Product() {

    }

    public EnumProduct getEnumProduct() {
        return enumProduct;
    }

    public void setEnumProduct(EnumProduct enumProduct) {
        this.enumProduct = enumProduct;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nName Product: " + enumProduct +
                "\nPrice :" + price+
                "\n............................";
    }
}
