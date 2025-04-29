class Singleton {
    int x = 0;  // Instance variable
    // Step 1: Declare the static instance of the class
    private static Singleton instance = null;

    // Step 2: Private constructor to prevent instantiation from outside
    private Singleton() {
        x = 0;  // Initializing x to 0
    }

    // Step 3: Public static method to provide access to the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();  // Lazy initialization
        }
        return instance;
    }

    // Optional: You can add methods to modify the `x` value if needed
    public void setX(int value) {
        this.x = value;
    }

    public int getX() {
        return this.x;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        // Getting the single instance of Singleton
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Print the initial value of x
        System.out.println("s1.x: " + s1.getX());  // Outputs 0
        System.out.println("s2.x: " + s2.getX());  // Outputs 0

        // Modify the value of x using one instance
        s1.setX(10);

        // Print the value of x after modification
        System.out.println("s1.x: " + s1.getX());  // Outputs 10
        System.out.println("s2.x: " + s2.getX());  // Outputs 10 (both instances share the same data)
    }
}
