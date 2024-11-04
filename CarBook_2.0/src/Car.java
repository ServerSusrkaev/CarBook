import java.io.Serializable;

public class Car implements Serializable {
    /*
    В данной версии необходимо сделать так, чтобы количество полей объекта зависило
    от того, сколько значени мы хотим указать.
     */


    final static String path = "D:\\Java\\MyProjects\\CarBook\\CarBook_2.0\\src\\DataBase.bin";
    long id;
    String brand;
    String model;
    int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return brand + ", " + model + ", " + speed;
    }
}