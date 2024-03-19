package A67.Lab.NestedClass;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class AnotherClass {
    //Main
    public static void main(String[] args) {
//        new MyStaticNestedClass();
        MyStaticNestedClass.MyInnerStaticClass cl = new MyStaticNestedClass.MyInnerStaticClass();
        MyStaticNestedClass my = new MyStaticNestedClass();

        //The following is illigal - compiler erro
//        MyStaticNestedClass.MyInnerStaticClass cl2 = my.new MyInnerStaticClass();
    }
}
