package A67;

import java.util.Comparator;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-02-03
 */
public class sortByAddress implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAddress().getZip() - o2.getAddress().getZip();
    }
}
