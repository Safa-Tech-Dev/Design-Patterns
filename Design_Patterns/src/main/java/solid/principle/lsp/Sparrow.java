package solid.principle.lsp;

/**
 * Sparrow can fly
 */
public class Sparrow implements Flyable{

    @Override
    public void fly() {

        System.out.println("Sparrow is flying");
    }
}
