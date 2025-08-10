package solid.principle.dip;

// Bluetooth Keyboard concrete class
public class BluetoothKeyboard implements Keyboard{


    @Override
    public void type() {
        System.out.println("typing with Bluetooth keyboard...");
    }
}
