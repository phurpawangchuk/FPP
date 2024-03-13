package MPP_Dan.lession2.unidirection.one_2_zero_one.models;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Item {
    private String item;
    private double price;

    private Item(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public static Item createItem(String item, double price) {
        return new Item(item, price);
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + item + '\'' +
                "price='" + price + '\'' +
                '}';
    }
}
