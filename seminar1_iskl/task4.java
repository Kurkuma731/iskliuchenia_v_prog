import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String userInput = getStringInput();
            System.out.println("Вы ввели: " + userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getStringInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя.");
        }

        return input;
    }
}