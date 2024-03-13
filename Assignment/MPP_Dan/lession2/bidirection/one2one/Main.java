package MPP_Dan.lession2.bidirection;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.addCustomer("Phurpa");
        customer.setAccount(new Account(1,"Fixed", customer));

        Customer customer1 = CustomerFactory.addCustomer("Karma");
        customer1.setAccount(new Account(2,"Saving", customer1));

        Customer customer2 = CustomerFactory.addCustomer("Dawa");
        customer2.setAccount(new Account(3,"FD", customer2));

        Customer[] customers = {customer, customer1, customer2};
        for(Customer c: customers){
            System.out.println(c.getAccount().getCustomer());
        }

    }
}
