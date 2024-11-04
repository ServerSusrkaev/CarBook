import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Input_Output {

    public static void write(ArrayList<Car> carsList){
        try{
            FileOutputStream fileOutpu = new FileOutputStream(Car.path, false);
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutpu);
            objectOutput.reset();
            objectOutput.writeObject(carsList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Car> read(ArrayList<Car> carsList){
        try{
            FileInputStream fileInput = new FileInputStream(Car.path);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            carsList = (ArrayList<Car>) objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            //throw new RuntimeException(e);
        }
        return carsList;
    }

    public static Car scanning(){
        String[] parts;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите через пробел <МАРКА> <МОДЕЛЬ> <СКОРОСТЬ>");

        parts = scanner.nextLine().split(" ");

        return new Car(parts[0], parts[1], Integer.parseInt(parts[2]));
    }

    public static String modelChoosing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите модель автомобиля: ");
        return scanner.next();
    }
}