package Task2;

public class Order {
    private Buyer buyer;
    private Product product;
    private Integer count;

    public Order(Buyer buyer, Product product, Integer count) {
        this.buyer = buyer;
        this.product = product;
        this.count = count;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "buyer=" + buyer +
                ", product=" + product +
                ", count=" + count +
                '}';
    }
}
