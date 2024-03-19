package A67.Lab.Exception;
import java.io.IOException;
public class Test1 {
    public static void main(String[] args) throws Exception {
       try {
           System.out.println("main");
           test();
       }catch (Exception e) {
           System.out.println(e.getMessage());
//           return;
       }finally {
           System.out.println("main finally");
       }
//        System.exit(0);
        System.out.println("END");
    }

    public static void myMethod() throws IOException {
        throw new IOException("myMethod"); //try commeting this
    }

    public static void test() throws Exception {
        try {
            System.out.println("Inside test");
//            return; //returns finally block, does not go beyond
//            System.exit(0);
            myMethod();
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new Exception("second");
        }finally {
//            System.exit(0);
            System.out.println("Finally");
        }
        //this will print only if there was not any exception in above
        System.out.println("Last statement");
        System.exit(0);//no effect
    }
}
