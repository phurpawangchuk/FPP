package Assignment5.Prob5;
/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Main {
    public static void main(String[] args) {

        Computer computer1 = new Computer("Intel","4",16, 2.6);
        Computer computer2 = new Computer("Intel","4",16, 2.6);
        Computer computer3 = new Computer("Apple","4",18, 2.6);

        System.out.println(computer1.equals(computer2)); //true
        System.out.println(computer1.equals(computer3)); //false

//        Computer[] computers = {computer1, computer2, computer3};
//        for(Computer c: computers){
//            System.out.println(c.getClass().getSimpleName()+" "+c.computePower());
//        }

    }
}
