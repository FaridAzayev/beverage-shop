import java.util.ArrayList;
import java.util.List;

public class OrderFactory implements Order {
    List<Order> orderList =  new ArrayList<>();

    public Order add (BeverageType beverageType) {
        orderList.add(null);
        return null;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
