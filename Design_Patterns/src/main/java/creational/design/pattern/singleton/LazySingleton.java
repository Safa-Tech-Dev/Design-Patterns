package creational.design.pattern.singleton;

// Not Thread-Safe if you are working in non-thread Environmenet
public class LazySingleton {

    // 1. Declare the instance
    private static LazySingleton INSTANCE;

    // 2. Private constructor to prevent external instantiation
    private LazySingleton(){
        System.out.println("instance created...");
    }

    // 3. Global access point, getInstance method
    public static LazySingleton getInstance(){

        if(INSTANCE == null){
            INSTANCE = new LazySingleton(); // create only once  instance
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        LazySingleton a1 = LazySingleton.getInstance();
        LazySingleton a2  = LazySingleton.getInstance();

        System.out.println(a1 == a2);
    }

}
