package MPP_Dan.lession2.bidirection;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Customer {
    private String customerName;
    private Account account;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void setAccount(Account account) {
        this.account = account;
        if (account.getCustomer() != this) {
            account.setCustomer(this);
        }
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", accountId =" + account.getAccountId() +
                ", account Type = " + account.getAccountType() +

                '}';
    }
}
