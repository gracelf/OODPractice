

package InheritanceAnimalAppDesign;

/**
 *
 */
public class DogAction {
    public static void main(String[] args){
        Dog dog = new Dog(1,"Rusky","1990/02/24");
        
        //if no constructor defined, default (or no-arg) constructor
        //Dog dog = new Dog();
        
       dog.swim();
       //dog inherit Id field from its parent class
       System.out.println("id:"+dog.getId());
        
    }

}
