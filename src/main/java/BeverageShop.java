public class BeverageShop {
    public static void main(String[] args) {
        Order order = new OrderFactory()
                .add(BeverageType.COFFEE,5)
                .add(BeverageType.MILKSHAKE)
                .add(BeverageType.TEA);

        System.out.println(order.receipt());
    }
}
