package MPP_Dan.lession2.unidirection.one_2_many;

import java.util.Arrays;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-08-03
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Phurpa");
        customer.addNewOrder(new Order("iPhone12"));
        customer.addNewOrder(new Order("iPhone14"));
        customer.addNewOrder(new Order("iPhone15"));

        Customer customer1 = new Customer("Wangchuk");
        customer1.addNewOrder(new Order("iPhone1"));
        customer1.addNewOrder(new Order("iPhone4"));
        customer1.addNewOrder(new Order("iPhone5"));

        List<Customer> customers = Arrays.asList(customer,customer1);
        for(Customer c: customers ) {
            System.out.println(c);
        }
    }
}
