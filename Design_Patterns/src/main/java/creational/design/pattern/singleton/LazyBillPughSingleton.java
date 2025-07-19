package creational.design.pattern.singleton;

// Below Java1.5 (Lazy + Fast + Thread-safe)
public class LazyBillPughSingleton {

    // 1. Private constructor to prevent external instantiation
    private LazyBillPughSingleton(){
        System.out.println("Lazy Bill Pugh Singleton instance created...");
    }

    // 2. private static class to hold the instance, not accessible outside the class
    private static class Holder{
        static LazyBillPughSingleton INSTANCE = new LazyBillPughSingleton();
    }

    // 3. Global access point, getInstance method
    public static LazyBillPughSingleton getInstance(){

        return Holder.INSTANCE;
    }

    public static void main(String[] args) {

        LazyBillPughSingleton a1 = LazyBillPughSingleton.getInstance();
        LazyBillPughSingleton a2  = LazyBillPughSingleton.getInstance();

        System.out.println(a1 == a2);
    }
}
