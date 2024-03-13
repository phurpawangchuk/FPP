package MPP_Dan.lession2.unidirection.one_2_one.models;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    //Singlton
//    private static Customer customer = null;
//    public static Customer createCustomer(String name, Account account)
//    {
//        if(customer == null)
//            customer = new Customer(name,account);
//        return customer;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " Name='" + getName() + '\'' +
                ", Account=" + getAccount().getId() +
                ", Balance = "+ getAccount().getBalance()+
                '}';
    }
}
