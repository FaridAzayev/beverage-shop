import org.junit.Test

class OrderTest {
    @Test void shouldCreateBeverageOrder(){
        List<Order> orderList =  new ArrayList<>();

        orderList.add(OrderFactory.add(BeverageType.TEA))
        orderList.add(OrderFactory.add(BeverageType.COFFEE))
    }
}
