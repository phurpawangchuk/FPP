package Assignment5.Prob4;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String fname, String sname, String ssn, double weeklySalary) {
        super(fname, sname, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee [" +
                "\nFirst Name: " + getFirstName()+
                "\nLast Name: " + getLastName()+
                "\nSSN      : " + getSocialSecurityNumber()+
                "\nWeeklySalary :" + getWeeklySalary() +
                "\n]";
    }
}
