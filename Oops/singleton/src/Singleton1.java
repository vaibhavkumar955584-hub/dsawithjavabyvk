class Singleton {
    // Step 1: Create a private static instance
    private static Singleton singleInstance = null;

    // Step 2: Private constructor
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Step 3: Public static method to get the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();  // Lazy initialization
        }
        return singleInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class Singleton1{
    public static void main(String[] args) {
        // Both calls return the same instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        System.out.println(obj1 == obj2); // true → same object
    }
}