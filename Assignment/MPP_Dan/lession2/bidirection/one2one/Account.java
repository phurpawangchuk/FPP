package MPP_Dan.lession2.bidirection;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Account {
   private Integer accountId;
   private String accountType;
   private Customer customer;

    public Account(Integer accountId, String accountType, Customer customer) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.customer = customer;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
