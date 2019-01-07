import java.util.ArrayList;
import java.util.List;

public class OrderFactory implements Order {
    List<Order> orderList =  new ArrayList<>();

    public OrderFactory add (BeverageType beverageType) {
        orderList.add(null);
        return null;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
