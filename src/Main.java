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
        human1.setCar(car1);

        human1.drive(150, 20);
        human1.setMoney(1000);
        System.out.println(human1.getMoney());
        System.out.println(car1.getMileage());
        human1.drive(90, 51);
        human1.repairCar();
        human1.drive(50, 10);
        System.out.println(car1.getMileage());






    }

}
