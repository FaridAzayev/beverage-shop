import beverages.AbstractBeverage
import beverages.Beverage
import beverages.Coffee
import beverages.MilkShake
import beverages.Tea
import org.junit.Before
import org.junit.Test
import static org.assertj.core.api.Assertions.*

class OrderTest {
    AbstractOrderFactory factory

    void init(){
        factory = new OrderFactoryWithSwitch()
//        factory = new OrderFactoryWithMap()
    }

    @Test void shouldCreateTeaOrder(){
        init()
        factory.add(BeverageType.TEA)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Tea.class)
    }

    @Test void shouldCreateCoffeeOrder(){
        init()
        factory.add(BeverageType.COFFEE)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Coffee.class)
    }

    @Test void checkInitialAmountOfBeverage(){
        init()
        factory.add(BeverageType.COFFEE)

        assertThat(factory.beverageList.get(0).amount()).isEqualTo(AbstractBeverage.INITIAL_AMOUNT)
    }

    @Test void shouldAddChainedOrder(){
        init()
        factory.add(BeverageType.TEA)
                .add(BeverageType.COFFEE)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Tea.class)
    }

    @Test void shouldCreateOrderWithAmount(){
        int amount = 5
        init()
        factory.add(BeverageType.TEA, amount)

        assertThat(factory.beverageList.get(0).class).isEqualTo(Tea.class)
    }

    @Test void shouldAddMilkshakeOrder(){
        init()
        factory.add(BeverageType.MILKSHAKE)

        assertThat(factory.beverageList.get(0).class).isEqualTo(MilkShake.class)
    }

    @Test void shouldGetTotalCostOfOrder(){
        init()
        factory.add(BeverageType.MILKSHAKE)
                .add(BeverageType.TEA)

        MilkShake milkShake = new MilkShake()
        Tea tea = new Tea()

        assertThat(factory.total()).isEqualTo(milkShake.cost()+ tea.cost())
    }
}
