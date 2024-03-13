package MPP_Dan.lession2.unidirection.one_2_zero_one_practice;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-08-03
 */
public class Customer {
    private String customerName;
    private Account account;

    public Customer(String customerName, Integer accNum) {
        this.customerName = customerName;
        this.account = new Account(accNum);
    }

    public void addAccount(Integer accNum){
//        if(accNum == null)
//            throw new IllegalArgumentException("Account already exist");

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", account=" + account.getId()+
                '}';
    }
}
