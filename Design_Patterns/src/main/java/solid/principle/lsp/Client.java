package solid.principle.lsp;

public class Client {

    public static void main(String[] args) {

        // subclass Sparrow can substitue the parent class Flyable
        Flyable sparrow = new Sparrow();
        sparrow.fly();

        // subclass Penguin can substitue the parent class Swimmable
        Swimmable penguin = new Penguin();
        penguin.swim();


    }
}
