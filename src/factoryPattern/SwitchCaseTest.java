package factoryPattern;

/**
 *
 */
public class SwitchCaseTest {

    public static String caseString = "1";

    public static void main(String[] args) {
        switch (SwitchCaseTest.caseString) {
            case "1":
                System.out.println("print out case 1");
                //break;  //without break, will always go to next case!!!
            case "2":
                System.out.println("print out case 2");
            default:
                System.out.println("print out case default");

        }

    }

}
