import clasess.CassaServiceAble;
import clasess.Markets;
import clasess.Person;
import clasess.Product;
import enums.EnumProduct;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
        new Person("Baiysh",300L,"b77",2000L),
        new Person("TIMA",100L,"b77",1000L),
        new Person("ADILET",400L,"b77",200L)
                ));
        CassaServiceAble cassaServiceAble = new CassaServiceAble();
        Product product = new Product();
        ArrayList<Product> productArrayList = new ArrayList<>(Arrays.asList(
                new Product(EnumProduct.BREAD, 50L),
                new Product(EnumProduct.MEAT, 1000L),
                new Product(EnumProduct.FANTA, 100L),
                new Product(EnumProduct.JUICE, 170L),
                new Product(EnumProduct.SALT, 40L),
                new Product(EnumProduct.SUGAR, 250L),
                new Product(EnumProduct.APPLE, 80L)));
        Markets markets = new Markets("Tesco", productArrayList,200L,400L);

        while (true) {
            System.out.println("""
                    >>>>>>>>>>|Commands|<<<<<<<<<<
                    press 1 to see all products
                    press 2 to add product
                    press 3 to delete product
                    press 4 to buy product
                    press 5 to see all persons""");
            int sw = new Scanner(System.in).nextInt();
            switch (sw) {
                case 1:
                    System.out.println(markets);
                    break;
                case 2:
                    cassaServiceAble.addProduct(productArrayList);
                    break;
                case 3:
                    cassaServiceAble.removeProduct(productArrayList);
                    break;
                case 4:
                    cassaServiceAble.getBuyProduct(people,markets);
                    break;
                case 5:
                    System.out.println(people);
                    break;
            }

        }

    }
}