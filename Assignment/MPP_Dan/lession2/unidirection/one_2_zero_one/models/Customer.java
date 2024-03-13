package MPP_Dan.lession2.unidirection.one_2_zero_one.models;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Customer {
    private String customerName;
    private ShoppingCart cart;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + getCustomerName() + '\'' +
                ", cart =" + getCart().getItemList()+
                '}';
    }
}
