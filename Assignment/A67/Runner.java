package A67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class Runner {
    public static void main(String[] args) {

        Employee employee1  = new Employee("Phurpa1", 45, new Address("Thimphu1", "Thim Thriom1", 101));
        Employee employee2 = new Employee("Karma2", 41, new Address("Thimphu2", "Thim Thriom2", 100));
        Employee employee3 = new Employee("Dawa3", 40, new Address("Thimphu3", "Thim Thriom3", 102));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

//        Collections.sort(employeeList);

//        System.out.println(employeeList);
        for(Employee e: employeeList){
            System.out.println(e);
        }
        System.out.println("\nSort by Name");
//        Collections.sort(employeeList, new sortByName());
        employeeList.sort(Comparator.comparing(Employee::getName));
//       employeeList.sort((Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());
        for(Employee e: employeeList){
            System.out.println(e);
        }

        System.out.println("\nSort by Age");
        employeeList.sort(Comparator.comparing(Employee::getAge));
        for(Employee e: employeeList){
            System.out.println(e);
        }

        System.out.println("\nSort by Address Zip");
       // Collections.sort(employeeList, new sortByAddress());
        // employeeList.sort( (e1,  e2) -> e1.getAddress().getZip() - e2.getAddress().getZip());
        employeeList.sort(Comparator.comparingInt(e -> e.getAddress().getZip()));

        for(Employee e: employeeList){
            System.out.println(e);
        }

    }

}
