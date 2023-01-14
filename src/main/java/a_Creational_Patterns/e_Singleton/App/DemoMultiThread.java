package a_Creational_Patterns.e_Singleton.App;

/*  The same class behaves incorrectly in a multithreaded environment.
Multiple threads can call the creation method simultaneously and
get several instances of Singleton class.    */

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.print("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT: \n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();

        // To fix the problem, you have to synchronize threads during first creation of the Singleton object.
        // Below is testing the fixed 'ThreadSafeSingleton'
        Thread threadFooSync = new Thread(new ThreadFooSync());
        Thread threadBarSync = new Thread(new ThreadBarSync());
        threadFooSync.start();
        threadBarSync.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.print(singleton.value + "\t");
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.print(singleton.value + "\t");
        }
    }

    static class ThreadFooSync implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.print(singleton.value + "\t");
        }
    }

    static class ThreadBarSync implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.print(singleton.value + "\t");
        }
    }
}
