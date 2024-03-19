package A67.Lab.MyComparator;


import Assignment11.Student;

import java.util.*;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-18-03
 */
public class Runner {
    public  enum SortByMethod {
        BYNAME,
        BYSALARY
    }

    static class compareByName implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) {
       employeeList();
      // intergerList();
    }

    private static void employeeList() {

        Employee e1 = new Employee("Zahie", 12.33);
        Employee e2 = new Employee("Capthy",122.2);
        Employee e3 = new Employee("Abdul", 12);

        List<Employee> employees = Arrays.asList(e1, e2, e3);
//        sortEmployee(employees, SortByMethod.BYNAME);
//        sortEmployee(employees, SortByMethod.BYSALARY);

//        Collections.sort(employees, Comparator.comparing(Employee::getName));
//        compareByName comp = new compareByName();
//        Collections.sort(employees, comp);

//        Collections.sort(employees, new compareByName());

//        Comparator<Employee> comp = (o1, o2)-> o1.getName().compareTo(o2.getName());
//        Collections.sort(employees, comp);

        //when comparable is implemented in the class, no second argument is required
       // Collections.sort(employees);

          System.out.println(employees);
    }

    private static void sortEmployee(List<Employee> employees, SortByMethod method) {
        switch (method){
            case BYNAME: Collections.sort(employees, new SortByName());
                         break;
            case BYSALARY: Collections.sort(employees, new SortBySalary());
                        break;
        }
    }

    private static void intergerList() {
        Comparator<Integer> comp = (x, y) -> x<y?-1:1;

        List<Integer> list = Arrays.asList(51,16,23,17,22,19);
        Collections.sort(list, comp);
        System.out.println(list);
    }
}
