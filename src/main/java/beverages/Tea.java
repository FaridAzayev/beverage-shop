package beverages;

public class Tea extends AbstractBeverage{
    public Tea() {
        this(INITIAL_AMOUNT);
    }

    public Tea(int amount) {
        super(5, amount);
    }
}