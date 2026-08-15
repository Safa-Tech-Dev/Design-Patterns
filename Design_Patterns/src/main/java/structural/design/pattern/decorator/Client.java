package structural.design.pattern.decorator;

public class Client {
    static void main() {

        Pizza plainPizza = new PlainPizza();
        System.out.printf("%s | Rs %.2f%n", plainPizza.getDescription(), plainPizza.getCost());

        Pizza cheeseOlive = new CheeseDecorator(new OliveDecorator(new PlainPizza()));
        System.out.printf("%s | Rs %.2f%n", cheeseOlive.getDescription(), cheeseOlive.getCost());

        Pizza cheeseOliveMushroom = new CheeseDecorator(new OliveDecorator( new MushroomDecorator(new PlainPizza())));
        System.out.printf("%s | Rs %.2f%n", cheeseOliveMushroom.getDescription(), cheeseOliveMushroom.getCost());


    }
}
