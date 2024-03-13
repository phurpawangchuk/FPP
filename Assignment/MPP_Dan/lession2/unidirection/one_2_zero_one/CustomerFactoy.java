package MPP_Dan.lession2.unidirection.one_2_zero_one;

import MPP_Dan.lession2.unidirection.one_2_zero_one.models.Customer;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class CustomerFactoy {
    public static Customer addNewCustomer(String name){
        return new Customer(name);
    }
}
