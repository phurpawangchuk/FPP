package Assignment5;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Main2 {
    public static void main(String[] args) {
        DeptEmployee[] deptEmployees = new DeptEmployee[5];

        Proferssor proferssor1 = new Proferssor(10,"Abram", LocalDate.now(), 1000);
        proferssor1.setNumberOfPublications(15);

        Proferssor proferssor2 = new Proferssor(20,"ALice", LocalDate.now(), 2000);
        proferssor2.setNumberOfPublications(25);

        Proferssor proferssor3 = new Proferssor(15,"Erick", LocalDate.now(), 3000);
        proferssor3.setNumberOfPublications(20);

        Secretary secretary1 = new Secretary("Burma", LocalDate.of(2020,10,10),1500);
        secretary1.setOvertimeHours(5);
        Secretary secretary2 = new Secretary("John", LocalDate.of(2020,5,10),1500);
        secretary2.setOvertimeHours(12);

        deptEmployees[0] = proferssor1;
        deptEmployees[1] = proferssor2;
        deptEmployees[2] = proferssor3;
        deptEmployees[3] = secretary1;
        deptEmployees[4] = secretary2;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        char input;
        while(flag) {
            double totalSalary = 0.0;
            for (DeptEmployee employee : deptEmployees) {
                totalSalary += employee.computeSalary();
            }
            System.out.println("Total salary: " + totalSalary);
            System.out.println("Do you want to continue to see the total salary? Y/N: ");
            input=sc.next().charAt(0);
            flag = input == 'Y'?true:false;
        }
    }
}
