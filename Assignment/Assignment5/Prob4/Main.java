package Assignment5.Prob4;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Main {
    public static void main(String[] args) {
        CommissionEmployee employee1 = new CommissionEmployee("Alice","Don", "SSN101",3000, 5);
        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee( "Bob", "Dann", "SSN1002",2500, 4, 1000);
        HourlyEmployee employee3 = new HourlyEmployee("Marck", "Ledon","SSN1003",2000, 14);
        SalariedEmployee employee4 = new SalariedEmployee("Kush", " Kota", "SSN104",500);
        SalariedEmployee employee5 = new SalariedEmployee("Adam", " Lucus", "SSN105",500);

        employee1.setCommisionRate(5);
        employee2.setCommisionRate(4);
        employee3.setHours(14);
        employee4.setWeeklySalary(700);
        employee5.setWeeklySalary(900);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5};

        double totalSalary = 0.0;
        for(Employee e: employees){
            totalSalary += e.getPayment();
        }
        System.out.println("Total Salary of all employees : "+totalSalary);


    }
}
