import org.junit.Before
import org.junit.Test
import static org.assertj.core.api.Assertions.*

class OrderTest {
    int INITIAL_AMOUNT = 1

    @Test void shouldCreateTeaOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.TEA)

        assertThat(factory.beverages.get(0).class).isEqualTo(Tea.class)
        assertThat(factory.beverages.get(0).amount()).isEqualTo(INITIAL_AMOUNT)
    }

    @Test void shouldCreateCoffeeOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.COFFEE)

        assertThat(factory.beverages.get(0).class).isEqualTo(Coffee.class)
        assertThat(factory.beverages.get(0).amount()).isEqualTo(INITIAL_AMOUNT)
    }

    @Test void shouldAddChainedOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.TEA)
                .add(BeverageType.COFFEE)

        assertThat(factory.beverages.get(0).class).isEqualTo(Tea.class)
        assertThat(factory.beverages.get(1).class).isEqualTo(Coffee.class)
    }
}
