public class Coffee implements Beverage{
    private int amount = 1;

    public int cost() {
        return 10;
    }

    public int amount() {
        return amount;
    }

    public Coffee() {
        this(1);
    }

    public Coffee(int amount) {
        this.amount = amount;
    }
}