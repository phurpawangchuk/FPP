package MPP_Dan.lession2.unidirection.one_2_one_practice;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.addCustomer("Phurpa", 1);
        System.out.println(customer.getAccount().getAccountNumber());

    }
}
