package MPP_Dan.lession8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-13-03
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee("Phurpa",12),
                new Employee("Karma",10),
                new Employee("Phurpa",1),
                new Employee("Karma",2),
                new Employee("Dawa",3));

       List<Employee> list = employee.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
