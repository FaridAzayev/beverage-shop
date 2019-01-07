public class OrderFactory implements Order {
    private BeverageType beverageType;

    public OrderFactory(BeverageType beverageType) {
        this.beverageType = beverageType;
    }
}
