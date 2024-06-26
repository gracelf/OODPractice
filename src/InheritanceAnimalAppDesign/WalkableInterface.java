/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceAnimalAppDesign;

/**
 *
 * @author GS\grace.fu
 */
interface WalkableInterface {

    //implicitly public https://stackoverflow.com/questions/5376970/protected-in-interfaces
    //Because an interface is supposed to mean "what you can see from outside the class". It would not make sense to add non-public methods
    //"interfaces define public APIs"
    //rare case: default concrete method https://www.baeldung.com/java-static-default-methods
    abstract void walk();

}
