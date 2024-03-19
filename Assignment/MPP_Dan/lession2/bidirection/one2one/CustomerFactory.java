package MPP_Dan.lession2.bidirection.one2one;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class CustomerFactory {
    public static Customer addCustomer(String name) {
        Customer customer = new Customer(name);
        return customer;
    }
}
