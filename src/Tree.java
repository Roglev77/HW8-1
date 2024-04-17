public class Tree {
    String type;
    int height, countOfSticks;
    String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "Зелений";
    }

    public Tree(int height, int countOfSticks, String colour) {
        this.type = "ялиця";
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Жовтий";
    }

    public Tree(String type) {
        this();
    }
}

