package A67.Lab.MidTermExam;

import java.util.Objects;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-09-03
 */
public class Vehicle {
    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return color.equals(vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
