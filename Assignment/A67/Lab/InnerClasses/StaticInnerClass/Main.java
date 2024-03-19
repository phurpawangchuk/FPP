package A67.Lab.InnerClasses.StaticInnerClass;

import A67.Lab.InnerClasses.MyInterface;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-08-03
 */
public class Main {
    int x;
    static class A{
        int x = 10;
        void printMe(int x){
            x = x+10;
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {

        new A().printMe(5);
    }
}
