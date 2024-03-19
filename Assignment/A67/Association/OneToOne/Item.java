package A67.Association.OneToOne;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Item {
    private String itemName;
    private double price;

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item[" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ']';
    }
}
