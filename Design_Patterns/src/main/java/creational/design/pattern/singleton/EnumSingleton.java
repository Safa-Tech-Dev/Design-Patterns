package creational.design.pattern.singleton;

// Thread-safe, Serialization safe, Reflection safe
public enum EnumSingleton {

    INTANCE;

    public void doSomething(){
        System.out.println("Working...");
    }

    public static void main(String[] args) {

        EnumSingleton a1 = EnumSingleton.INTANCE;
        a1.doSomething();
    }
}
