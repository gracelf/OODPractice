package OOD4rules;



/**
 *
 */
public class Test {

    public void test() {
        new StaticInnerClassTest();
        //default modifier
        new StaticInnerClassTest.InnerClass();
        //private, cannot refer, error
        //new StaticInnerClassTest.PrivateInnerClass();
    }
}
