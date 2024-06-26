package singletonPattern;

/**
 *
 */
public class SingletonPatternDemo {

    private static SingletonPatternDemo instance; //final => immutable

    private SingletonPatternDemo() {
        System.out.println("constructor: instanciate the instance ....");
    }

    public static SingletonPatternDemo getInstance() {
        if (instance == null) {
            synchronized (SingletonPatternDemo.class) {
                if (instance == null) {
                    //set instance value
                    instance = new SingletonPatternDemo();
                }
            }

        }

        return instance;

    }

}
