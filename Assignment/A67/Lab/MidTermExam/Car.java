package A67.Lab.MidTermExam;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Car extends Vehicle{
    int doors;
    public Car(String color, int d) {
        super(color);
        doors = d;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Vechicle[ Color: "+ super.getColor() +
                ", doors=" + doors +
                ']';
    }
}
