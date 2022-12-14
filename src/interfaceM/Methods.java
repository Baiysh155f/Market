package interfaceM;

import clasess.Markets;
import clasess.Person;
import clasess.Product;

import java.util.List;

public interface Methods {
    void addProduct(List<Product> products);
    void removeProduct(List<Product> products);
    void getBuyProduct(List<Person> people , Markets market);
}
