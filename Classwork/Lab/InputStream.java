package Lab;

import java.util.Scanner;

public class InputStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: "+sc.nextLine());
        System.out.println("Enter age: "+sc.nextInt());
        System.out.println("Enter Salary: "+sc.nextDouble());

        sc.close();
    }
}
