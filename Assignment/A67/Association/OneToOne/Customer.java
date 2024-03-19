package A67.Association.OneToOne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Customer {
    private String name;
    private ShoppingCart cart;

    private List<Order> orders;

    public Customer(String name){
        this.name = name;
        orders = new ArrayList<Order>();
    }

    public void addOrder(Order order){
       orders.add(order);
    }

    public List<Order> getOrder(){
    return orders;
    }

    public String getName() {
        return name;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
