import java.util.ArrayList;
import java.util.Scanner;

public class Options {
    static ArrayList<Car> carsList = new ArrayList<>();

    public static void add(){
        carsList.addAll(ListCreator.filArray(carsList));

        boolean flag = true;

        while (flag){
            carsList.add(Input_Output.scanning());
            System.out.println("Продолжить ввод: 1 = да; 0 = нет");

            Scanner scanner = new Scanner(System.in);

            int option = scanner.nextInt();

            if (option == 0) {
                Input_Output.write(carsList);
                carsList.clear();
                flag = false;
            }
        }
    }

    public static void show(){
        int id = 1;

        carsList.addAll(ListCreator.filArray(carsList));

        for (Car item: carsList){
            System.out.println(id + ". " +item);
            id++;
        }
        carsList.clear();
    }

    public static void find(){

        carsList.addAll(ListCreator.filArray(carsList));

        String searchingCar = Input_Output.modelChoosing();

        for (Car car: carsList){
            if (car.getModel().equals(searchingCar)){
                System.out.println(car);
            }
        }
        carsList.clear();
    }

    public static void update(){
        carsList.addAll(ListCreator.filArray(carsList));
        String updaitingCar = Input_Output.modelChoosing(); 
        for (Car car: carsList){
            if (car.getModel().equals(updaitingCar)){
                System.out.println("Редактируемая запись: " + car);
                int index = carsList.indexOf(car);
                carsList.set(index, Input_Output.scanning());
            }
        }
        Input_Output.write(carsList);
        carsList.clear();
    }

    public static void delete(){
        carsList.addAll(ListCreator.filArray(carsList));
        String deletingCar = Input_Output.modelChoosing();
        try{
            int index = -1;
            for (Car car: carsList){
                if (car.getModel().equals(deletingCar)){
                    index = carsList.indexOf(car);
                }
            }
            carsList.remove(index);
            Input_Output.write(carsList);
            carsList.clear();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Модель не найдена.");
        }
        carsList.clear();
    }
}