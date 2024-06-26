

package hashMapDesign.multimap;

import hashMapDesign.*;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 *this can also be a private inner class in MyHashMap.java
 */
public class Cell<K, V> {
    private K key; 
    // Cell<K,V> V presents generics, V is defined as List<V> in implementation
    private List<V> value; 

    /**
     *
     * @param key
     * @param value
     */
    public Cell(K key, List<V> value) {
        this.key = key;
        this.value = value;
    }
    
    public boolean keyEquals(K key){
        return this.key == null ? key ==null : this.key.equals(key);
    }
    
    // do we need to override hashcode() and equals() method in Cell class ?????
    @Override
    public int hashCode(){
        return key == null? 0: key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cell<?,?>){
            Cell<K,List<V>> cell = (Cell<K, List<V>>) obj;
            return cell.getKey() == null? this.key == null: cell.getKey().equals(this.key);
        }
        return false;
    }
    

    /**
     * @return the key
     */
    public K getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * @return the value
     */
    public List<V> getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(List<V> value) {
        this.value = value;
    }

    private static class V {

        public V() {
        }
    }
    
    
    
    

}
