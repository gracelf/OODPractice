package UtilClassDesign;





/**
 *design a util class that only allows static method
 */
public class UtilsClass {
    
    //private constrcutor, 1 no inheritance 2 cannot be instantiated and thus any non-static field or method won'tbe called
    private UtilsClass(){};
    
    public static void foo(){
        System.out.println("this is a static metho");
    };
    
    public  static void main(String[] args){
        foo();
    }

}
