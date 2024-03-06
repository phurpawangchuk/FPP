package Assignment6;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-05-03
 */
public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b',"Billy");
        t.add('c',"Charlie");
        t.add('d',"Doji");

        System.out.println(t.get('b'));
        System.out.println(t);
    }
}
