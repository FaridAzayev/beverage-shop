import java.util.ArrayList;
import java.util.List;

public class OrderFactory {
    List<Beverage> beverages =  new ArrayList<>();

    public OrderFactory add (BeverageType beverageType) {
        beverages.add(null);
        return null;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }
}
