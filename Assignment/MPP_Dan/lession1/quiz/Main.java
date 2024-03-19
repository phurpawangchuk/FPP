package MPP_Dan.lession1.quiz;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-06-03
 */
public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[]{
                new Person("Alice",30, LocalDate.now().plusYears(2).plusMonths(4)),
                new Person("Bob",30, LocalDate.now().plusYears(5)),
                new Person("Cathy",30, LocalDate.now().plusYears(7))
        };

        //List<Person> personList = Arrays.asList(person);

        for(Person p: person){
            if(p.checkAge(p.getDob())) {
                System.out.println(p);
            }
        }
    }
}
