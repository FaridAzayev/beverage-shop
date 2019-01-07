import java.util.ArrayList;
import java.util.List;

public class OrderFactory {
    List<Beverage> beverages =  new ArrayList<>();

    public OrderFactory add (BeverageType beverageType) {
        switch (beverageType) {
            case TEA:
                beverages.add(new Tea());
                break;
            case COFFEE:
                beverages.add(new Coffee());
                break;
        }

        return this;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }
}
