import program.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car(CarType.AUDI, Color.BLUE);
        car1.setMileage(4950);
        System.out.println(car1.getType());
        car1.setMaxSpeed(280);
        car1.setColor(Color.pink);
        System.out.println(car1.getColor());
        Human human1 = new Human();
        human1.setFirstName("Richard");
        human1.setCar(car1);

        System.out.println("Fixisin.");

        System.out.println(human1.getFirstName());
        System.out.println(human1.getMoney());
        System.out.println(human1.getDrivingExperience());
        human1.repairCar();
        double timeTaken = human1.drive(45, 100);
        System.out.println(timeTaken + " minutes driven.");
        System.out.println(human1.getDrivingExperience());
        human1.getCar().setWorking(false);
        System.out.println("Kas auto töötab? " + human1.getCar().isWorking());
        human1.setMoney(500);
        human1.repairCar();
        System.out.println("Auto töötab jälle " + human1.getCar().isWorking());
        var carPart1 = new CarPart();
        carPart1.setPart(CarPartType.TURBO);
        System.out.println(carPart1.getPart());



    }

}
