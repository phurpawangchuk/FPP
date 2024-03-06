package Assignment5.Prob4;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class CommissionEmployee extends Employee{

    private double grossSale;
    private double commisionRate;

    public CommissionEmployee(String fname, String sname, String ssn, double grossSale, double commisionRate) {
        super(fname,sname,ssn);
        this.grossSale = grossSale;
        this.commisionRate = commisionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    @Override
    public double getPayment() {
        return getGrossSale() * getCommisionRate();
    }

    @Override
    public String toString() {
        return "CommissionEmployee [ " +
                "\nFirst Name: " + getFirstName()+
                "\nLast Name: " + getLastName()+
                "\nSSN      : " + getSocialSecurityNumber()+
                "\nGrossSale=" + getGrossSale() +
                "\nCommision Rate=" + getCommisionRate() +
                "\n]";
    }
}
