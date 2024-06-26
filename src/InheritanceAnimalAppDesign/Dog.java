

package InheritanceAnimalAppDesign;

import java.util.Date;

/**
 *
 */
public class Dog extends Mammal implements SwimableInterface{
    //constructor, no need to define fields again, inherited from parent class
    public Dog(int id, String name, String dob) {
        super(id, name, dob);
    }
    @Override
    void eat(){

        System.out.println("eating");
        
    
    }
    
        @Override
    public void swim(){
        System.out.println("swimming");
        
    }

}
