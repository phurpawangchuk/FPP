package A67.Lab.OrderOfExecution;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */

/**
 * 1. Parent static variable
 * 2. Parent static block
 * 3. Child static varible
 * 4. Child static block
 * 5. Parent instance variable
 * 6. Parent instance block
 * 7. Parent constructor
 * 8. Child instance variable
 * 9. Child instance block
 * 10. Child constructor
 */
public class Main {
    public static void main(String[] args) {
        //new Parent(200);
        new Child("Hello");
        new Child("Hey");
    }
}
