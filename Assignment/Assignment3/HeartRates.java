package Assignment3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String birthDate;

    public HeartRates(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getPersonAge(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.parse(getBirthDate(), formatter);
        Period totalAge = Period.between(dob, today);
        return totalAge.getYears();
    }

    public int getMaxHeartRate(){
        return 220 - getPersonAge();
    }

    public void calculatePersonHeartRange(){
        int RHR = 70;
        int MHR = 220 - getPersonAge();
        int AHR = MHR - RHR;
        double LB = 0.5;
        double UB = 0.85;
        double LBTHR= (AHR*LB) + RHR;
        double UBTHR = (AHR*UB) + RHR;

        System.out.println("The Result of Target Heart Rate Range is between "+ LBTHR + " and "+ UBTHR);
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Age: "
                + this.getPersonAge() + "\n" + "Date of Birth: " + getBirthDate() + "\n" + "Maximum Heart Rate: "
                + this.getMaxHeartRate();
    }
}
