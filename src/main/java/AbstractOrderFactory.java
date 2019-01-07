import beverages.Beverage;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractOrderFactory implements Order{
    protected List<Beverage> beverageList =  new ArrayList<>();

    @Override
    public String receipt() {
        StringBuilder sb = new StringBuilder();
        beverageList.forEach(b-> sb.append(getFormattedReceiptText(b)));
        return sb.toString();
    }

    @Override
    public int total() {
        int toralCost = 0;
        for(Beverage beverage : beverageList){
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
