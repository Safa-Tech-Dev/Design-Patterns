package solid.principle.dip;

// Computer depends on abstractions (Mouse and Keyboard)
public class Computer{

    private Mouse mouse;
    private Keyboard keyboard;

    // Constructor injection
    public Computer(Mouse mouse, Keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    // Use Device method
    public void useDevice(){
        mouse.click();
        keyboard.type();
    }
}
