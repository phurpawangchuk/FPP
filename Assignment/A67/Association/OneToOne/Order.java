package A67.Association.OneToOne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class Order {
    private List<Item> itemList;
    private LocalDate orderDate;

    Order(){}

    private Order(LocalDate orderDate, Customer cus) {
        if(orderDate == null)
            throw  new NullPointerException("Order Date is empty");

        this.orderDate = orderDate;
        itemList = new ArrayList<Item>();
//        cus.setOrders(orderDate);
    }

    public static Order addOrder(LocalDate orderDate, Customer c) {
        if(orderDate == null)
            throw  new NullPointerException("Order Date is empty");
        return new Order(orderDate, c);
    }

//    public void addItemToOrder(Item item){
//        itemList.add(item);
//    }

}
