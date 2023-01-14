package a_Creational_Patterns.e_Singleton.App;

public final class Singleton {
    // The field for storing the singleton instance should be declared static.
    private static Singleton instance;
    public String value;

    // The singleton's constructor should always be private to
    // prevent direct construction calls with the `new` operator.
    private Singleton(String value) {
        // The following code emulates slow initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    // The static method that controls access to the singleton instance.
    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
