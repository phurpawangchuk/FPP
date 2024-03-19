package MPP_Dan.lession8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-11-03
 */
public class FunctionDemo {
    enum sortMethod {
        NAME,
        SALARY
    }

    private sortMethod method;
    FunctionDemo(sortMethod method){
        this.method = method;
    }

    public void sort(List<Employee> employees){
        if(method == sortMethod.NAME)
            Collections.sort(employees, new EmployeeNameComparator());
        if(method == sortMethod.SALARY)
            Collections.sort(employees, new EmployeeNameComparator());
    }


    public static void sortBy(List<Employee> employee, sortMethod method) {
        if (method == sortMethod.NAME) {
            Collections.sort(employee, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }else if (method == sortMethod.SALARY) {
            Collections.sort(employee, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return Double.compare(o1.getSalary(), o2.getSalary());
                }
            });
        }
    }

    public static void main(String[] args) {
        //Method reference type: class::instance
        Function<String, String> str = s -> s.toUpperCase();
        Function<String, String> s = String::toUpperCase;
        System.out.println(str.apply("abcas"));
        System.out.println(s.apply("nvncvn"));

        Employee e = new Employee("cbc", 11);
        Employee e1 = new Employee("banab", 8);
        Employee e2 = new Employee("dhhu", 3);
        Employee e3 = new Employee("chap", 2);
        Employee e4 = new Employee("Achang", 4);
        List<Employee> employee = Arrays.asList(e, e1, e2, e3, e4);

//        FunctionDemo dm= new FunctionDemo(sortMethod.NAME);
//        dm.sort(employee);

        System.out.println(employee);

        sortBy(employee, sortMethod.NAME);
        System.out.println(employee);

        sortBy(employee, sortMethod.SALARY);
        System.out.println(employee);

//        Comparator compareName = new EmployeeNameComparator();
//        Collections.sort(employee, compareName);
//        System.out.println(employee);
//
//        employee.stream()
//                .filter(em -> em.getName().startsWith("c"))
//                .map(em -> em.getName().toUpperCase())
//                .collect(Collectors.toList())
//                .forEach(c -> System.out.println(c));
//
//       for(Employee emp: employee) {
//           System.out.println(emp.getName());
//       }
    }
}
