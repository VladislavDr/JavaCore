package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class Market {
    public static List<Buyer> BUYERLIST = new ArrayList<>();
    public static List<Product> PRODUCTLIST = new ArrayList<>();
    public static List<Order> ORDERLIST = new ArrayList<>();

    public static Order getProduct(Buyer buyer, Product product, int count) {
        try {
            if (!BUYERLIST.contains(buyer)) {
                throw new CustomerExeption();
            }
            if (!PRODUCTLIST.contains(product)) {
                throw new ProductExeption();
            }
            if (count <= 0 || count >= 100) {
                count = 1;
                throw new AmountExeption();
            }
            return new Order(buyer, product, count);
        } catch (CustomerExeption | ProductExeption | AmountExeption e) {
            e.printStackTrace();
        }
        return null;
    }
}
