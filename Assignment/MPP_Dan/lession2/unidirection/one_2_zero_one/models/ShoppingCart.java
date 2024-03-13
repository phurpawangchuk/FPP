package MPP_Dan.lession2.unidirection.one_2_zero_one.models;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class ShoppingCart {
    List<Item> itemList = new ArrayList<>();

    private ShoppingCart(Customer customer) {
        customer.setCart(this);
    }

    public static ShoppingCart addNewShoppingCart(Customer customer){
        return new ShoppingCart(customer);
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item){
        itemList.add(item);
    }
}
