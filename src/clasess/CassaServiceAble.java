package clasess;

import enums.EnumProduct;
import interfaceM.Methods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CassaServiceAble implements Methods {
    @Override
    public void addProduct(List<Product> products) {
        System.out.println("write name product");
        String strName = new Scanner(System.in).nextLine();
        System.out.println("write price");
        long strPrice = new Scanner(System.in).nextLong();
        products.add(new Product(EnumProduct.valueOf(strName), strPrice));
    }

    @Override
    public void removeProduct(List<Product> products) {
        System.out.println("write product's name that you want to remove");
        String strName = new Scanner(System.in).nextLine();
        for (Product product : products) {
            if (product.getEnumProduct().name().contains(strName)) {
                products.remove(product.getEnumProduct());
                System.out.println("removed");
            }
        }

    }

    @Override
    public void getBuyProduct(List<Person> people, Markets market) {

        System.out.println("write name person");
        String strName = new Scanner(System.in).nextLine();
        for (Person person : people) {
            if (person.getName().contains(strName)) {
                long summa = 0;
                String name ="";
                String b = "";
                long a = 0;
                while (true) {
                    System.out.println("do you wont a buy (YES/NO)");
                    String yesOrNo = new Scanner(System.in).nextLine();

                    if (yesOrNo.contains("yes")) {
                        System.out.println("Write name product");
                        String productName = new Scanner(System.in).nextLine();
                        for (int i = 0; i < market.getProducts().size(); i++) {
                            if (market.getProducts().get(i).getEnumProduct().name().contains(productName)) {
                                long s = market.getProducts().get(i).getPrice();
                                market.setCashAccount(market.getCashAccount() + s);
                                person.setCashPay(person.getCashPay() - s);
                                a = market.getProducts().get(i).getPrice();
                                summa += a;
                                b = String.valueOf(market.getProducts().get(i).getEnumProduct());
                                name += b;
                                System.out.println("Name Product :"+b+" Price :"+a);
                            }
                        }
                    } else {
                        System.out.println("\n\t________________\n\t|>Market Tesco<|\n\t^^^^^^^^^^^^^^^^");
                        System.out.println("Name Product :"+b+" Price :"+a);
                        System.out.println("total :" + summa);
                        break;
                    }
                }
            }
        }
    }
}
