package solid.principle.dip;

// Wired Mouse concrete class
public class WiredMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Clicking with Wired Mouse...");
    }
}
