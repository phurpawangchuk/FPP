package Assignment5.Prog2;

import java.time.LocalDate;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Secretary extends DeptEmployee{
    private double overtimeHours;

    public Secretary(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        double salary = super.computeSalary();
        return salary+12*getOvertimeHours();
    }
}
