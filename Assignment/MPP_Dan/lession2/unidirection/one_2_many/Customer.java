package MPP_Dan.lession2.unidirection.one_2_many;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-08-03
 */
public class Customer {
    private String customerName;
    private List<Order> orders = new ArrayList<>();

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void addNewOrder(Order item){
        orders.add(item);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' + getOrders() +
                '}';
    }
}
