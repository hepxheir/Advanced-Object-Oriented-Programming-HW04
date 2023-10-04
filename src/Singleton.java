public class Singleton {
    // inner static class
    private static class InnerSingleton {
        static final Singleton instance = new Singleton();
    }

    private Singleton() {
        System.out.println("Singleton constructor");
    }

    public static Singleton getInstance() {
        return InnerSingleton.instance;
    }

    public void print() {
        System.out.println("Singleton instance hashCode = " + hashCode());
    }
}
