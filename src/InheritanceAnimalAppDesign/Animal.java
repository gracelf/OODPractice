

package InheritanceAnimalAppDesign;

/**
 *
 */
public abstract class Animal {
    private int id; 
    private String name;
    private String dob;
    
//    public Animal(){
//    }
    
    //abstract class cannot be instanciated, even though it has constructor
    public Animal(int id, String name, String dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    
    }
    
    abstract void eat();
    
    abstract void breath();

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

}
