package OOD4rules;

/**
 * https://stackoverflow.com/questions/16661595/why-can-you-not-inherit-from-a-class-whose-constructor-is-private
 * https://stackoverflow.com/questions/16184797/why-derived-class-overriding-method-should-not-be-more-restrictive-than-base-cla
 */
public class PrivateConstructorStaticMethod {

    // static inner class
    static class A {

        private A() {
            System.out.println("Subclassed A in " + getClass().getName());
        }

        protected void method() {
            System.out.println("Hello from class A");
        }
    }

    // static inner class B in the same file/Class, have access to "private" constructor method
    static class B extends A {

        public B() {
        }

        //https://www.geeksforgeeks.org/method-overriding-with-access-modifier/
        //If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive
        //a caller who only knows about your superclass should still be able to use any instance of the subclass that it's given
        // explanation 2: child class should always be able to be used in a place where an instance of the superclass is expected
        public void method() {
            System.out.println("Hello from class B");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.method();
        B b = new B();
        b.method();
        
        A a_b= new B();        
        // a caller who only knows about your superclass should still be able to use any instance of the subclass that it's given
        //print "hello from class b", calls B ultimately 
        a_b.method();
        
        //sub class c=> super class
        A c = (A) b;
        //print "hello from class b", calls B ultimately 
        //child class should always be able to be used in a place where an instance of the superclass is expected
        c.method();
        
        //super class => sub class
        // runtime error: snakeLecture.PrivateConstructorMain$A cannot be cast to snakeLecture.PrivateConstructorMain$B
        //B ba = (B) a;      
        //ba.method();
        if (a instanceof B){
            B bFromA = (B) a;
        }

    }
}
