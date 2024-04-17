import java.util.Scanner;

public class Converter {
    private String name;

    public Converter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int convertToInt(byte value) {
        return value;
    }

    public int convertToInt(short value) {
        return value;
    }

    public int convertToInt(int value) {
        return value;
    }

    public int convertToInt(long value) {
        return (int) value;
    }

    public int convertToInt(char value) {
        return Character.getNumericValue(value);
    }

    public int convertToInt(float value) {
        return (int) value;
    }

    public int convertToInt(double value) {
        return (int) value;
    }

    public int convertToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Не вдалося конвертувати.");
            return 0;
        }
    }

    public double convertToDouble(short value) {
        return value;
    }

    public double convertToDouble(int value) {
        return value;
    }

    public double convertToDouble(long value) {
        return value;
    }

    public double convertToDouble(char value) {
        return Character.getNumericValue(value);
    }

    public double convertToDouble(float value) {
        return value;
    }

    public double convertToDouble(double value) {
        return value;
    }

    public double convertToDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Не вдалося конвертувати");
            return 0.0;
        }
    }

    public String convertToString(byte value) {
        return String.valueOf(value);
    }

    public String convertToString(short value) {
        return String.valueOf(value);
    }

    public String convertToString(int value) {
        return String.valueOf(value);
    }

    public String convertToString(long value) {
        return String.valueOf(value);
    }

    public String convertToString(char value) {
        return String.valueOf(value);
    }

    public String convertToString(boolean value) {
        return String.valueOf(value);
    }

    public String convertToString(float value) {
        return String.valueOf(value);
    }

    public String convertToString(double value) {
        return String.valueOf(value);
    }

    public String convertToString(String value) {
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Converter converter = new Converter("Конвертер");

        System.out.println("Що ви хочете конвертувати:");
        System.out.println("1. byte");
        System.out.println("2. short");
        System.out.println("3. int");
        System.out.println("4. long");
        System.out.println("5. char");
        System.out.println("6. float");
        System.out.println("7. double");
        System.out.println("8. String");

        System.out.print("Введіть дані: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Введіть byte: ");
                byte byteValue = scanner.nextByte();
                System.out.println("Конвертовано в Int: " + converter.convertToInt(byteValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(byteValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(byteValue));
                break;
            case 2:
                System.out.print("Введіть short: ");
                short shortValue = scanner.nextShort();
                System.out.println("Конвертовано в Int: " + converter.convertToInt(shortValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(shortValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(shortValue));
                break;
            case 3:
                System.out.print("Введіть int: ");
                int intValue = scanner.nextInt();
                System.out.println("Конвертовано в Int: " + converter.convertToInt(intValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(intValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(intValue));
                break;
            case 4:
                System.out.print("Введіть long: ");
                long longValue = scanner.nextLong();
                System.out.println("Конвертовано в Int: " + converter.convertToInt(longValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(longValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(longValue));
                break;
            case 5:
                System.out.print("Введіть char: ");
                char charValue = scanner.next().charAt(0);
                System.out.println("Конвертовано в Int: " + converter.convertToInt(charValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(charValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(charValue));
                break;
            case 6:
                System.out.print("Введіть float: ");
                float floatValue = scanner.nextFloat();
                System.out.println("Конвертовано в Int: " + converter.convertToInt(floatValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(floatValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(floatValue));
                break;
            case 7:
                System.out.print("Введіть double: ");
                double doubleValue = scanner.nextDouble();
                System.out.println("Конвертовано в Int: " + converter.convertToInt(doubleValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(doubleValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(doubleValue));
                break;
            case 8:
                System.out.print("Введіть string: ");
                String stringValue = scanner.nextLine();
                System.out.println("Конвертовано в Int: " + converter.convertToInt(stringValue));
                System.out.println("Конвертовано в Double: " + converter.convertToDouble(stringValue));
                System.out.println("Конвертовано в String: " + converter.convertToString(stringValue));
                break;
            default:
                System.out.println("Некоректні дані");
        }
    }
}
