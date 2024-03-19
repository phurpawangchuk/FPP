package A67.Lab.Inheritance;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-07-03
 */
public class BiCycle extends Bike{
 private int height;

    public BiCycle(int gear, int speed, int height) {
        super(gear, speed);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BiCycle{" +
                "gear=" + super.getGear() +
                "speed=" + super.getSpeed() +
                "height=" + height +

                '}';
    }


}
