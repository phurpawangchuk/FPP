package Assignment8.Prob1;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-12-03
 */
public class Person {
        private String lastName;
        private String firstName;
        private int age;

        public Person(String firstName, String lastName, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person[FirstName=" + getFirstName() + ", LastName=" + getLastName() +
                ", Age=" + getAge() + "]"; }
}
