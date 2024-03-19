package A67.Association.OneToOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class ShoppingCart  {
    private List<Item> items;

    ShoppingCart(){
//        items = new ArrayList<>();
    }

    //Use a Factory method construction
    private ShoppingCart(Customer cust){
        items = new ArrayList<Item>();
        cust.setCart(this);
    }

    public static ShoppingCart newShoppingCart(Customer cus){
        if(cus == null)
            throw new NullPointerException("Null customer");
        return new ShoppingCart(cus);
    }
    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems(){
    return items;
    }

    @Override
    public String toString() {
        return "[" +
                "items=" + items +
                ']';
    }
}
