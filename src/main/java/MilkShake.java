public class MilkShake extends AbstractBeverage{
    public MilkShake() {
        this(INITIAL_AMOUNT);
    }

    public MilkShake(int amount) {
        super(15, amount);
    }
}