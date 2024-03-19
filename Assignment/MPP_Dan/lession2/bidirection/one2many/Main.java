package MPP_Dan.lession2.bidirection.one2many;

import java.util.Collections;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Phurpa");
        customer.setAccounts(new Account(1, "FD"));
        customer.setAccounts(new Account(2, "Saving"));
        customer.setAccounts(new Account(3, "Current"));

//        System.out.println(customer);

//        System.out.println(customer.getAccounts());

    }
}
