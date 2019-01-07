import org.junit.Test

class OrderTest {
    @Test void shouldCreateBeverageOrder(){
        Order order = OrderFactory.add(BeverageType.TEA)
    }
}
