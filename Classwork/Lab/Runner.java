package Lab;

public class Runner {
    static class A{
        static int sum = 10;

    }

    public static void main(String[] args) {

//        Employee employee = new Employee("Phurpa", 345.00);
//        System.out.println(employee);
//        Runner runner = new Runner();
//        System.out.println();

        //Enum
//        for(DayOfWeeks day: DayOfWeeks.values()){
//            System.out.println(day + " - "+day.ordinal()+" -"+day.name());
//        }

//        InstanceDemo instanceDemo = new InstanceDemo();
//        for(int i=0; i<10; i++){
//            new InstanceDemo();
//        }
//        System.out.println(InstanceDemo.getInstance());
//
//
//        InstanceDemo instanceDemo = new InstanceDemo();
//        InstanceDemo instanceDemo1 = new InstanceDemo();
//        InstanceDemo instanceDemo2 = new InstanceDemo();
//        System.out.println("Instnce: "+instanceDemo.getInstance());



//        Employee employee = new Employee();
//        Employee a = new Employee("Alice",3000);
//        Employee b =  new Employee("Bob", 5000);
//
//        employee.swap(a,b);
//        System.out.println("A : "+a.getName()+" Salary: "+ a.getSalary());
//        System.out.println("B : "+b.getName()+" Salary: "+ b.getSalary());


        //Singleton
        Singleton.getInstance();
        Singleton.getInstance();
        System.out.println("Key: "+Singleton.getKey());
        System.out.println("DB: "+Singleton.getDbName());

    }
}
