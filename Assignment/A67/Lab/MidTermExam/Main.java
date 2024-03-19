package A67.Lab.MidTermExam;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Main implements MyInterface{
    public static void main(String[] args) {

        Car car = new Car("Red",4);
        Car car1 = new Car("Blue",5);

        Car[] cars = {car,car1};

        for(Car c: cars){
            System.out.println(c);
        }

        new Main().doSomething();

        Greeting g = (f,l) -> "First:"+f+", Lname:"+l;
        System.out.println(g.printMe("ASS","BB"));


    }

    @Override
    public void doSomething() {
        System.out.println("Hi");
    }
}
