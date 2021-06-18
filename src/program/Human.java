package program;

import java.util.Date;
import java.util.Random;


//TUNE CAR
public class Human {

    public Human () {
        System.out.println("Without parameters");
    }

    public Human (String firstName) {
        this.firstName = firstName;
        System.out.println("With firstname");

    }

    public Human (String firstName, String lastName, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        System.out.println("With both names");

    }

    private Car car;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int money = 100;
    private Id id;

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    private int drivingExperience;

    public void tune() {

    }

    public double drive(int speed, int distance) {
        if (speed > car.getMaxSpeed()) {
            System.out.println("This is over the max speed of this vehicle. Max speed is " + car.getMaxSpeed());
            return 0;
        }
        if (speed > 100) {
            money -= 500;
            System.out.println("Since you were speeding over 100, 500€ was removed.");
            System.out.println("Your balance is now: " + money);
            return 0;
        }
        //speed = distance / time
        // 2 = 6 / 3
        Random r = new Random();
        int breakChance = r.nextInt(10) + 1;
        if (breakChance == 5) {
            car.setWorking(false);
            System.out.println("Your car broke.");
            return 0;
        }
        double timeDriven = Math.round(((double) distance / speed) * 60);
        if (timeDriven > 30) {
            drivingExperience += distance;
        }
        car.drive(distance);
        // WE WILL RETURN HOW LONG DID IT TAKE TO DRIVE
        return timeDriven;

    }

    public boolean repairCar() {
        if (money < 100) {
            throw new Error("Not enough money to repair.");
        }
        car.setWorking(true);
        money -= 100;
        car.setMileage(0);
        return true;
    }






































    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }
}
