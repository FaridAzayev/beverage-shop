import beverages.AbstractBeverage;
import beverages.Beverage;

@FunctionalInterface
public interface Request<T extends Beverage> {
    void add(int amount);

    default void add(){
        add(AbstractBeverage.INITIAL_AMOUNT);
    }
}
