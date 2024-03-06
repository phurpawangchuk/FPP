package Assignment5.Prob5;

import java.util.Objects;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-04-03
 */
public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public double computePower(){
        return getRamSize() * getProcessorSpeed();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return  this.getRamSize() == computer.getRamSize() &&
                this.getProcessorSpeed() == computer.getProcessorSpeed() &&
                this.getProcessor().equals(computer.getProcessor()) &&
                this.getManufacturer().equals(computer.getManufacturer());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getManufacturer(), getProcessor(), getRamSize(), getProcessorSpeed());
    }
}
