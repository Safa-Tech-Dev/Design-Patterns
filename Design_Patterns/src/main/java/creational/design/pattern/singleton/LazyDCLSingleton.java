package creational.design.pattern.singleton;

// Double Checked Locking , for Mutlti-Threaded Environment
public class LazyDCLSingleton {

    // 1. Declare the instance with volatile=read/write value from main memory instead of cache
    private static volatile LazyDCLSingleton INSTANCE;

    // 2. Private constructor to prevent external instantiation
    private LazyDCLSingleton(){
        System.out.println("instance created...");
    }

    // 3. Global access point, getInstance method with double checked locking with synchronization
    public static LazyDCLSingleton getInstance(){

        if(INSTANCE == null){ // first checked(no locking)
            synchronized (LazyDCLSingleton.class){
                if(INSTANCE == null){ // second check with locking
                    INSTANCE = new LazyDCLSingleton(); // create only once  instance
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {

        LazyDCLSingleton a1 = LazyDCLSingleton.getInstance();
        LazyDCLSingleton a2  = LazyDCLSingleton.getInstance();

        System.out.println(a1 == a2);
    }
}
