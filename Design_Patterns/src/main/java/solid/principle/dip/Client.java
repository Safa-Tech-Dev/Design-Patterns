package solid.principle.dip;

public class Client {

    public static void main(String[] args) {

        // Inject wired device dependencies via constructor
        Mouse wiredMouse = new WiredMouse();
        Keyboard wiredKeyboard = new WiredKeyboard();

        Computer computer1 = new Computer(wiredMouse, wiredKeyboard);
        computer1.useDevice();

        // Inject bluetooth dependencies via constructor
        Mouse bluetoothMouse = new BluetoothMouse();
        Keyboard bluetoothKeyboard = new BluetoothKeyboard();

        Computer computer2 = new Computer(bluetoothMouse, bluetoothKeyboard);
        computer2.useDevice();

    }
}
