package A67.Lab.MyComparator;

import java.util.Comparator;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-18-03
 */
public class SortBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(),e2.getSalary());
    }
}
