public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton constructor");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("Singleton instance hashCode = " + instance.hashCode());
    }
}
