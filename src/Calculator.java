import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("Калькулятор запущено");
        System.out.println("Введіть дію (або 'Stop' для завершення):");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("Stop")) {
            performOperation(input);
            System.out.println("Введіть дію (або 'Stop' для завершення):");
            input = scanner.nextLine();
        }

        System.out.println("Калькулятор закрито");
        scanner.close();
    }

    public static void performOperation(String input) {
        double result;
        if (input.contains("+")) {
            String[] numbers = input.split("\\+");
            result = summ(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
            System.out.println("Результат: " + result);
        } else if (input.contains("-")) {
            String[] numbers = input.split("-");
            result = minus(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
            System.out.println("Результат: " + result);
        } else if (input.contains("*")) {
            String[] numbers = input.split("\\*");
            result = multiply(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
            System.out.println("Результат: " + result);
        } else if (input.contains("/")) {
            String[] numbers = input.split("/");
            result = division(Double.parseDouble(numbers[0]), Double.parseDouble(numbers[1]));
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Неправильний формат.");
        }
    }

    public static double summ(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Ділення на нуль неможливе");
            return 0;
        }
        return a / b;
    }
}
