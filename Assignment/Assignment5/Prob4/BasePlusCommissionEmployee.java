package Assignment5.Prob4;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String fname, String sname, String ssn, double grossSale, double commisionRate, double baseSalary) {
        super(fname, sname, ssn, grossSale,commisionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return getBaseSalary()+ super.getPayment();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee[" +
                "\nFirst Name: " + getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nSSN      : " + getSocialSecurityNumber()+
                "\nBaseSalary: " + getBaseSalary() +
                "\n]";
    }
}
