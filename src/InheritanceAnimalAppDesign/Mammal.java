package InheritanceAnimalAppDesign;

/**
 *
 */
public abstract class Mammal extends OxygenAnimal implements WalkableInterface {

    // need to implement/override constructor, even in abstract class, field can be inherited
    public Mammal(int id, String name, String dob) {
        super(id, name, dob);
    }

    @Override
    void useOxygen() {
        System.out.println("use oxygen with mouth");

    }

    @Override
    public  void walk() { //only public is allowed, cause interface abstract method is implicitly public
        System.out.println("walking");

    }

}
