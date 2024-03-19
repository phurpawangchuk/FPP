package A67.Lab.Lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class Main{

    public static void main(String[] args) {
//        compareName n = () -> "Hello";
//        System.out.println(n.getName());

        Employee e1 = new Employee("Employee1");
        Employee e2 = new Employee("Employee2");
        List<Employee> list = Arrays.asList(e1,e2);
        System.out.println(list);

        CompareName compname = new CompareName() {
            @Override
            public boolean compareName(Employee e1, Employee e2) {
                return e1.getEmpName().equals(e2.getEmpName());
            }
        };
        System.out.println("e1===e2 "+compname.compareName(e1,e2));
        System.out.println(list.toArray());

//        System.out.println(new CompareName() {
//            @Override
//            public boolean compareName(Employee e1, Employee e2) {
//                return e1.getEmpName().equals(e2.getEmpName());
//            }
//        });

//       class compareByName implements Comparator<Employee> {
//          @Override
//          public int compare(Employee o1, Employee o2) {
//              return o1.getAge() -  o2.getAge();
//          }
//      }


        BiConsumer<Integer, Integer> l1 = (x,y) -> System.out.println(x+y);
        l1.accept(4,5);

        BiFunction<Integer, Integer, Double> l2 = (x,y) -> {
            double s = 0.0;
            return s+x+y;
        };
        l2.apply(4,5);

        Discount l3 = x -> x-10;
        int discount = l3.giveDiscount(60);
        System.out.println(discount);

        EvenCheck isEvenOdd = x -> x % 2 == 0;
        System.out.println(isEvenOdd.isEvenNumber(50));

        DefaultPrice dp = () -> 2500.0;
        System.out.println(dp.price());

        OddCheck od = x -> x%2 != 0;
        System.out.println(od.isOddNumber((byte) 5));

        Capatilize ch = c -> Character.toUpperCase(c) ;
        System.out.println(ch.toCapital('b'));

    }
}
