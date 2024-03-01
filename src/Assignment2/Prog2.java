package Assignment2;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Please, enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Please, enter your birth date in the format (yyyy-mm-dd) - Example 1978-5-23 : ");
        String dob = sc.nextLine();

        HeartRates heartRates = new HeartRates(firstName, lastName, dob);
        heartRates.calculatePersonHeartRange();

        System.out.println(heartRates.toString());
        sc.close();

    }
}
