import beverages.Coffee;
import beverages.MilkShake;
import beverages.Tea;

import java.util.HashMap;
import java.util.Map;

public class OrderFactoryWithMap extends AbstractOrderFactory {
    private Map<BeverageType, Request<?>> beverageRequests = new HashMap<>();

    {
        beverageRequests.put(BeverageType.TEA, (amount) -> beverageList.add(new Tea(amount)));
        beverageRequests.put(BeverageType.COFFEE, (amount) -> beverageList.add(new Coffee(amount)));
        beverageRequests.put(BeverageType.MILKSHAKE, (amount) -> beverageList.add(new MilkShake(amount)));
    }

    public OrderFactoryWithMap add (BeverageType beverageType, int amount) {
        beverageRequests.get(beverageType).add(amount);
        return this;
    }
}