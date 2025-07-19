package creational.design.pattern.singleton;

public class EagerSingleton {


    // 1. Create the instance at the time of class loading
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // 2. Private constructor to prevent external instantiation
    private EagerSingleton(){
        System.out.println("instance created...");
    }

    // 3. Global access point, getInstance method
    public static EagerSingleton getInstance(){

        return INSTANCE;
    }
    public static void main(String[] args) {

        EagerSingleton a1 = EagerSingleton.getInstance();
        EagerSingleton a2 = EagerSingleton.getInstance();

        System.out.println(a1 == a2);

    }
}
