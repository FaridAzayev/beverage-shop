public class BeverageShop {
    public static void main(String[] args) {
        printOrderReceipt(new OrderFactoryWithSwitch());
        printOrderReceipt(new OrderFactoryWithMap());
    }

    private static void printOrderReceipt(AbstractOrderFactory factory) {
        Order order = factory
                .add(BeverageType.COFFEE, 5)
                .add(BeverageType.MILKSHAKE)
                .add(BeverageType.TEA);

        System.out.println(order.receipt());
    }
}
