package A67.Lab.Exception;
/**
 * @year 2024-16-03
 */
public class ExceptionTest {
    public static void test() throws Exception{
        try{
//            return;
//            System.exit(0);
//            throw new Exception("First");
            System.out.println("in the test");
            myMethod();
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new Exception("second");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("last");
        System.exit(0);
    }

    public static void myMethod() throws Exception {
        throw new Exception("mymethod");
    }

    public static void main(String[] args) {

        try {
            System.out.println("Hi");
            test();
        }catch (Exception e){
            System.out.println("inside main:"+e.getMessage());
        }
        System.out.println("END");
    }
}
