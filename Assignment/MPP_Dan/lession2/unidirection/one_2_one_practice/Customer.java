package MPP_Dan.lession2.unidirection.one_2_one_practice;

import java.util.Objects;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Integer acc) {
        this.name = name;
        this.account = new Account(acc);
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void addAccount(Account account){
        if(this.account == null)
            this.account = account;
        else if(this.account.equals(account))
            throw  new IllegalArgumentException("Already exist");
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(getAccount(), customer.getAccount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getAccount());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + getAccount().getAccountNumber() +
                '}';
    }

    //    public void setAccount(Account account) {
//        this.account = account;
//    }
}

