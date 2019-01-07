import org.junit.Before
import org.junit.Test
import static org.assertj.core.api.Assertions.*

class OrderTest {
    int INITIAL_AMOUNT = 1

    @Test void shouldCreateTeaOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.TEA)

        assertThat(factory.beverages.get(0).class).isEqualTo(Tea.class)
    }

    @Test void shouldCreateCoffeeOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.COFFEE)

        assertThat(factory.beverages.get(0).class).isEqualTo(Coffee.class)
    }

    @Test void checkInitialAmountOfBeverage(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.COFFEE)

        assertThat(factory.beverages.get(0).amount()).isEqualTo(AbstractBeverage.INITIAL_AMOUNT)
    }

    @Test void shouldAddChainedOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.TEA)
                .add(BeverageType.COFFEE)

        assertThat(factory.beverages.get(0).class).isEqualTo(Tea.class)
    }
}
