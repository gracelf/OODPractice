package OOD4rules;



/**
 *ref https://www.w3schools.com/java/java_inner_classes.asp
 */
public class StaticInnerClassTest {

    static int staticVariable;
    int nonStaticVariable;

    static void staticMethod() {
        //nonStaticVariable = 7; ---error: non static variable cannot be referenced from a static conext
        staticVariable = 7;

        //refer a class and class instance is fine
        StaticInnerClassTest test = new StaticInnerClassTest();
        test.nonStaticVariable = 8;
    }

    static class InnerClass {
        double innerStaticVariable = 0.00;
        // One advantage of inner classes, is that they can access attributes and methods of the outer class (inside method only)
        public int myInnerMethod() {
            //return nonStaticVariable; ----error: non static variable cannot be referenced from a static conext
            return staticVariable;
        }
    }

    static private class PrivateInnerClass {
        static double staticVariable = 0.00;
    }
    
    class RegularInnerClass {
       void method(){
       // nonStaticVariable = 0; //cann't reference variable in outter class
        StaticInnerClassTest test1 = new StaticInnerClassTest();
        test1.nonStaticVariable=7;
       }
    
    }
}
