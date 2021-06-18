package program;

public class CarPart {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarPartType getPart() {
        return part;
    }

    public void setPart(CarPartType part) {
        this.part = part;
    }

    private String name;
    private CarPartType part;


}
