package MPP_Dan.lession1.quiz;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-06-03
 */
public class Person {
    private String name;
    private int age;
    private LocalDate dob;

    public Person(String name, int age, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }

    public LocalDate getDob() {
        return dob;
    }

    public boolean checkAge(LocalDate date){
        Period period = Period.between(LocalDate.now(), date);
        int year = period.getYears();
        return year < 3 ? true : false;
    }
}
