package Assignment8.Prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
     * @param employeeList
     */
	public static double computeSumOfSalaries(List<EmployeeData> employeeList) {
		//implement
        double sum=0.0;
		//compute sum of all salaries of people in aList and return
        for(EmployeeData emp: employeeList){
            sum += emp.getSalary();
        }
        return sum;
	}
}
