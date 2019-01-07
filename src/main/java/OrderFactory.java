import beverages.Coffee;
import beverages.MilkShake;
import beverages.Tea;

public class OrderFactory extends AbstractOrderFactory{
    public OrderFactory add (BeverageType beverageType) {
        switch (beverageType) {
            case TEA:
                beverageList.add(new Tea());
                break;
            case COFFEE:
                beverageList.add(new Coffee());
                break;
            case MILKSHAKE:
                beverageList.add(new MilkShake());
                break;
            default: throw new RuntimeException();
        }

        return this;
    }

    public OrderFactory add (BeverageType beverageType, int amount) {
        switch (beverageType) {
            case TEA:
                beverageList.add(new Tea(amount));
                break;
            case COFFEE:
                beverageList.add(new Coffee(amount));
                break;
            case MILKSHAKE:
                beverageList.add(new MilkShake(amount));
                break;
            default: throw new RuntimeException();
        }

        return this;
    }
}
