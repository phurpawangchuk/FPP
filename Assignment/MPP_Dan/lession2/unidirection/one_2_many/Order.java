package MPP_Dan.lession2.unidirection.one_2_many;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-08-03
 */
public class Order {
    private String order;

    public Order(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order='" + order + '\'' +
                '}';
    }
}
