

package hashMapDesign;

import java.util.Objects;

/**
 *this can also be a private inner class in MyHashMap.java
 */
public class Cell<K, V> {
    private K key; 
    private V value; 

    public Cell(K key, V value) {
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
            Cell<K,V> cell = (Cell<K, V>) obj;
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
    public V getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(V value) {
        this.value = value;
    }
    
    
    
    

}
