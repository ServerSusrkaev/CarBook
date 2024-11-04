import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("""
                    ВЫБЕРИТЕ НОМЕР ОПЕРАЦИИ:
                    1. Добавить;
                    2. Показать;
                    3. Найти;
                    4. Редактировать;
                    5. Удалить;
                    0. Выйти
                    """);
            int option = scanner.nextInt();
            switch (option){
                case 1: Options.add(); break;
                case 2: Options.show(); break;
                case 3: Options.find(); break;
                case 4: Options.update(); break;
                case 5: Options.delete(); break;
                case 0: flag = false; break;
            }
        }
    }
}