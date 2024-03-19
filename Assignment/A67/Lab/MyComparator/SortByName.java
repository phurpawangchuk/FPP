package A67.Lab.MyComparator;

import java.util.Comparator;
import java.util.Objects;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-18-03
 */
//public class SortByName implements Comparator<Employee> {

public class SortByName implements Comparator<Employee> {

@Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getName().compareTo(e2.getName()) != 0) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
        return 1;
    }
}
