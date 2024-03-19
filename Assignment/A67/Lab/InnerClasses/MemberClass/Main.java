package A67.Lab.InnerClasses.MemberClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-08-03
 */
public class Main {
    class A{
        public void print(){
            System.out.println("Hi");
        }
    }

    //Static class
    static class B {
        public void staticMe(){

        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.new A().print();

        B b = new B();
        b.staticMe();

    }
}
