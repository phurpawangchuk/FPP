package A67.Association.OneToOne;


import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Phurpa");
        Item item1 = new Item("iPhone 15", 1500);
        Item item2 = new Item("iPhone 10", 1000);

        Customer customer2 = new Customer("Karma");
        Item item4 = new Item("iPhone 5", 1500);
        Item item5 = new Item("iPhone 1", 1000);

        ShoppingCart sc1 = ShoppingCart.newShoppingCart(customer1);
        sc1.addItem(item1);
        sc1.addItem(item2);

        ShoppingCart sc2 = ShoppingCart.newShoppingCart(customer2);
        sc2.addItem(item4);
        sc2.addItem(item5);

        List<Customer> customers = Arrays.asList(customer1, customer2);

        for(Customer c: customers) {
            String customerName = c.getName();
            ShoppingCart cart = c.getCart();

            System.out.println(customerName+" \n"+cart);
        }

        Order order1 = Order.addOrder(LocalDate.of(2020,2,2), customer1);
        Order order2 = Order.addOrder(LocalDate.of(2022,5,2), customer2);

        for(Customer c: customers) {
            String customerName = c.getName();
//            System.out.println(customerName+" \n"+order);
        }


    }
}
