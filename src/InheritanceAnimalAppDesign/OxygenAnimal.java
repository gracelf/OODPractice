package InheritanceAnimalAppDesign;

/**
 *
 */
public abstract class OxygenAnimal extends Animal {

    private int id;
    private String name;
    private String dob;

    public OxygenAnimal(int id, String name, String dob) {
        super(id, name, dob);
    }

    @Override
    void breath() {
        getOxygen();
        //abstract method
        useOxygen();
    }

    private void getOxygen() {
        System.out.println("Getting oxygen");
    }

    abstract void useOxygen();
}
