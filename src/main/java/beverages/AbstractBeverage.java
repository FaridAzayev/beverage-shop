package beverages;

public abstract class AbstractBeverage implements Beverage{
    public static final int INITIAL_AMOUNT = 1;
    private int cost;
    private int amount;


    public AbstractBeverage(int cost) {
        this.cost = cost;
        this.amount = INITIAL_AMOUNT;
    }

    public AbstractBeverage(int cost, int amount) {
        this.cost = cost;
        this.amount = amount;
    }

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public int amount() {
        return amount;
    }
}