package MPP_Dan.lession2.unidirection.one_2_one;

import MPP_Dan.lession2.unidirection.one_2_one.models.Account;
import MPP_Dan.lession2.unidirection.one_2_one.models.Customer;

import java.util.Arrays;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Main {
    public static void main(String[] args) {

        Customer customer1 = CustomerFactory.addCustomer("Phurpa", new Account(1, 100.0));
        customer1.setAccount(new Account(5, 24.0));

        Customer customer2 = CustomerFactory.addCustomer("Dann", new Account(2, 150.0));
        Customer customer3 = CustomerFactory.addCustomer("Marc", new Account(4, 200.0));

        List<Customer> customers = Arrays.asList(customer1,customer2,customer3);

        for(Customer c: customers){
            System.out.println(c);
        }

    }
}
