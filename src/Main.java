public class Main {
    public static void main(String[] args) {

        Tree tree1 = new Tree();
        System.out.println("Tree 1: " + tree1.type + ", Height: " + tree1.height + ", Count of sticks: " + tree1.countOfSticks + ", Colour: " + tree1.colour);

        Tree tree2 = new Tree(250, 20, "Червоний");
        System.out.println("Tree 2: " + tree2.type + ", Height: " + tree2.height + ", Count of sticks: " + tree2.countOfSticks + ", Colour: " + tree2.colour);

        Tree tree3 = new Tree();
        System.out.println("Tree 3: " + tree3.type + ", Height: " + tree3.height + ", Count of sticks: " + tree3.countOfSticks + ", Colour: " + tree3.colour);

        Tree tree4 = new Tree("");
        System.out.println("Tree 4: " + tree4.type + ", Height: " + tree4.height + ", Count of sticks: " + tree4.countOfSticks + ", Colour: " + tree4.colour);
    }
}