package MPP_Dan.lession2.bidirection.one2many;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Account {
    private Integer accountId;
    private String accountType;

    public Account(Integer accountId, String accType) {

        this.accountId = accountId;
        accountType = accType;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountType=" + accountType +
                '}';
    }
}
