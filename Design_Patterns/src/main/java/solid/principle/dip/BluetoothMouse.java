package solid.principle.dip;

// Bluetooth Mouse concrete class
public class BluetoothMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Clicking with Bluetooth Mouse...");
    }
}
