public class Coffee extends AbstractBeverage{
    public Coffee() {
        this(INITIAL_AMOUNT);
    }

    public Coffee(int amount) {
        super(10, amount);
    }
}