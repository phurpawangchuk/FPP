package A67.Lab.Clonable;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */
public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Employee("Abc", 12.33);

        try{
            Employee e2 = (Employee) e1.clone();
            e2.setName("Wangchuk");

            System.out.println("Afer: "+e2.getName());

//            e1.setName(e2.getName());
            System.out.println("Before: "+e1.getName());

        }catch (CloneNotSupportedException e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
