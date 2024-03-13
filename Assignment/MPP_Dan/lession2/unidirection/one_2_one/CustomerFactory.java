package MPP_Dan.lession2.unidirection.one_2_one;

import MPP_Dan.lession2.unidirection.one_2_one.models.Account;
import MPP_Dan.lession2.unidirection.one_2_one.models.Customer;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class CustomerFactory {
    public static Customer addCustomer(String name, Account account){
        return new Customer(name, account);
        //Singleton
//        Customer customer = Customer.createCustomer(name, account);
//        return customer;
    }

}
