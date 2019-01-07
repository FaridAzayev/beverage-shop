import beverages.AbstractBeverage
import beverages.Coffee
import beverages.MilkShake
import beverages.Tea
import org.junit.Test
import static org.assertj.core.api.Assertions.*

class OrderTest {
    int INITIAL_AMOUNT = 1

    @Test void shouldCreateTeaOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.TEA)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Tea.class)
    }

    @Test void shouldCreateCoffeeOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.COFFEE)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Coffee.class)
    }

    @Test void checkInitialAmountOfBeverage(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.COFFEE)

        assertThat(factory.beverageList.get(0).amount()).isEqualTo(AbstractBeverage.INITIAL_AMOUNT)
    }

    @Test void shouldAddChainedOrder(){
        OrderFactory factory = new OrderFactory()
        factory.add(BeverageType.TEA)
                .add(BeverageType.COFFEE)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Tea.class)
    }

    @Test void shouldCreateOrderWithAmount(){
        OrderFactory factory = new OrderFactory()
        int amount = 5

        factory.add(BeverageType.TEA, amount)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Tea.class)
    }

    @Test void shouldAddMilkshakeOrder(){
        OrderFactory factory = new OrderFactory()

        factory.add(BeverageType.MILKSHAKE)

        assertThat(factory.beverageList.get(0).class).isEqualTo(MilkShake.class)
    }

    @Test void shouldGetTotalCostOfOrder(){
        OrderFactory factory = new OrderFactory()

        factory.add(BeverageType.MILKSHAKE)
                .add(BeverageType.TEA)

        MilkShake milkShake = new MilkShake()
        Tea tea = new Tea()

        assertThat(factory.total()).isEqualTo(milkShake.cost()+ tea.cost())
    }
}
