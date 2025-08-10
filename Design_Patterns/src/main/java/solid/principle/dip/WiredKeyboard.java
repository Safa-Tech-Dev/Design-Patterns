package solid.principle.dip;

// Wire Keyboard concrete class
public class WiredKeyboard implements Keyboard{
    @Override
    public void type() {
        System.out.println("Typing with WiredKeyboard...");
    }
}
