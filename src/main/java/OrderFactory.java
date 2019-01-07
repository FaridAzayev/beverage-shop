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
            case MILKSHAKE:
                beverages.add(new MilkShake());
                break;
            default: throw new RuntimeException();
        }

        return this;
    }

    public OrderFactory add (BeverageType beverageType, int amount) {
        switch (beverageType) {
            case TEA:
                beverages.add(new Tea(amount));
                break;
            case COFFEE:
                beverages.add(new Coffee(amount));
                break;
            case MILKSHAKE:
                beverages.add(new MilkShake(amount));
                break;
            default: throw new RuntimeException();
        }

        return this;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }
}
