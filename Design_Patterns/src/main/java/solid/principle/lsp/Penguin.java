package solid.principle.lsp;

/**
 * Penguin can swim
 */
public class Penguin implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
