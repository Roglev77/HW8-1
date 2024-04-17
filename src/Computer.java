import java.util.Objects;

public class Computer {
    final String brand;
    final int price;
    final int ram;
    final int graphicsCard;

    public Computer(String brand, int price, int ram, int graphicsCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }
    @Override
    public String toString() {
        return "Створено PC.\n" +
                "Ім'я = " + brand + ".\n" +
                "Ціна = " + price + ".\n" +
                "Відеокарта = " + graphicsCard + ".\n" +
                "ОЗУ = " + ram + ".";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return price == computer.price &&
                ram == computer.ram &&
                graphicsCard == computer.graphicsCard &&
                Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, ram, graphicsCard);
    }
}
