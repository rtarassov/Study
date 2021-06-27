package program;

import java.awt.*;

public class Car {

    public Car(CarType type, Color color) {
        this.type = type;
        this.color = color;
    }

    private CarType type;
    private CarPart part1;
    private CarPart part2;
    private Color color;
    private int maxSpeed = 250;
    private boolean isWorking = true;
    private int mileage;

    public void drive (int distance) {


        if (mileage > 5000) {
            throw new Error("The car must be repaired.");
        }
        mileage += distance;
    }
















    public CarType getType() {
        return type;
    }

    public CarPart getPart1() {
        return part1;
    }

    public void setPart1(CarPart part1) {
        this.part1 = part1;
    }

    public CarPart getPart2() {
        return part2;
    }

    public void setPart2(CarPart part2) {
        this.part2 = part2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }




}
