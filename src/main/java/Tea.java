public class Tea implements Beverage{
    private int amount = 1;

    public int cost() {
        return 5;
    }

    public int amount() {
        return amount;
    }

    public Tea() {
        this(1);
    }

    public Tea(int amount) {
        this.amount = amount;
    }
}