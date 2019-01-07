import org.junit.Test

class OrderTest {
    @Test void shouldCreateBeverageOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.TEA)
                .add(BeverageType.COFFEE)
    }
}
