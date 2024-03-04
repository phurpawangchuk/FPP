package Assignment6.Prob4;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String fname, String sname, String ssn, double wage, double hours) {
        super(fname, sname, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPayment() {
        return getWage() * getHours();
    }

    @Override
    public String toString() {
        return "HourlyEmployee [" +
                "\nFirst Name: " + getFirstName()+
                "\nLast Name: " + getLastName()+
                "\nSSN      : " + getSocialSecurityNumber()+
                "\nWage :" + getWage() +
                "\nHour:" + getHours() +
                "\n]";
    }
}
