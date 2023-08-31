/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float floatValue = 0.0f;
        boolean validInput = false;

        do {
            try {
                System.out.print("Введите дробное число: ");
                floatValue = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Неверный ввод. Пожалуйста, введите дробное число.");
                scanner.next(); // Очистить буфер ввода
            }
        } while (!validInput);

        return floatValue;
    }
}