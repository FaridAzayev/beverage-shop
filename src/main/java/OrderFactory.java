import beverages.Beverage;
import beverages.Coffee;
import beverages.MilkShake;
import beverages.Tea;

import java.util.ArrayList;
import java.util.List;

public class OrderFactory implements Order{
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

    @Override
    public String receipt() {
        StringBuilder sb = new StringBuilder();
        beverages.forEach(b-> sb.append(getFormattedReceiptText(b)));
        return sb.toString();
    }

    @Override
    public int total() {
        int toralCost = 0;
        for(Beverage beverage : beverages){
            toralCost += beverage.cost()*beverage.amount();
        }
        return toralCost;
    }

    private String getFormattedReceiptText(Beverage x) {
        return String.format("%s ........... %d*%d = %d"
                , x.getClass().getName().split("\\w+\\.")[1]
                , x.cost()
                , x.amount()
                , x.cost()*x.amount());
    }
}
