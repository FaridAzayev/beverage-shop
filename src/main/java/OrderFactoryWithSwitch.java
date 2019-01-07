import beverages.Coffee;
import beverages.MilkShake;
import beverages.Tea;

public class OrderFactoryWithSwitch extends AbstractOrderFactory {
    public OrderFactoryWithSwitch add (BeverageType beverageType, int amount) {
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