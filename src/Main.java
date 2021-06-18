import program.*;
import java.awt.*;
import java.util.Date;

public class Main {


    public static void main(String[] args) {

        long algus = System.currentTimeMillis();

        Car car1 = new Car(CarType.AUDI, Color.BLUE);
        car1.setMileage(4950);
        System.out.println(car1.getType());
        car1.setMaxSpeed(280);
        car1.setColor(Color.pink);
        System.out.println(car1.getColor());
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        System.out.println();
        Human human1 = new Human("Richard", "Tarassov", date);
        System.out.println(human1.getBirthDate());
        human1.setFirstName("Richard");
        human1.setCar(car1);



        System.out.println(human1.getFirstName());
        long lopp = System.currentTimeMillis();
        System.out.println(lopp - algus);
        System.out.println(human1.getDrivingExperience());
        human1.repairCar();
        human1.repairCar();
        System.out.println("Auto töötab jälle " + human1.getCar().isWorking());
        var carPart1 = new CarPart();
        carPart1.setPart(CarPartType.TURBO);
        System.out.println(carPart1.getPart());




    }

}
