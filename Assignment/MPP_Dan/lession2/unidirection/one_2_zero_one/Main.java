package MPP_Dan.lession2.unidirection.one_2_zero_one;
import MPP_Dan.lession2.unidirection.one_2_zero_one.models.Customer;
import MPP_Dan.lession2.unidirection.one_2_zero_one.models.Item;
import MPP_Dan.lession2.unidirection.one_2_zero_one.models.ShoppingCart;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Main {
    public static void main(String[] args) {

        Customer customer = CustomerFactoy.addNewCustomer("Phurpa");
        ShoppingCart cart = ShoppingCart.addNewShoppingCart(customer);
        cart.addItem(Item.createItem("Pen", 12));
        cart.addItem(Item.createItem("Shoe", 10));
        cart.addItem(Item.createItem("Bag", 15));
        System.out.println(customer);

//        Customer customer1 = CustomerFactoy.addNewCustomer("Dann");
//        ShoppingCart cart1 = ShoppingCart.addNewShoppingCart(customer1);
//        cart1.addItem(Item.createItem("Cheese"));
//        cart1.addItem(Item.createItem("Pencil"));
//        cart1.addItem(Item.createItem("Nike"));
//        System.out.println(customer1);
//
//        Customer customer2 = CustomerFactoy.addNewCustomer("Macr");
//        ShoppingCart cart2 = ShoppingCart.addNewShoppingCart(customer2);

    }
}
