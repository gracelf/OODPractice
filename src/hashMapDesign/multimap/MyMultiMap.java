package hashMapDesign.multimap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class MyMultiMap<K, V> {

    private ArrayList<Cell<K, List<V>>>[] buckets;
    private static final double LOAD_FACTOR = 0.75d;
    private int capacity = 256;
    private int size;

    public MyMultiMap() {
        this.buckets = new ArrayList[capacity];
        size = 0;
    }

    public int keyToIndex(K key) {
        return key == null ? 0 : Math.abs(key.hashCode() % capacity);
    }

    public List<V> get(K key) {
        int index = this.keyToIndex(key);
        ArrayList<Cell<K, List<V>>> bucket = buckets[index];
        for (Cell<K, List<V>> cell : bucket) {
            if (cell.keyEquals(key)) { //need to self-define this method  to handle key == null
                return (List<V>) cell.getValue();
            }
        }
        return null;
    }

    // input V, not List<V>
    public List<V> put(K key, V value) {
        if (this.size >= capacity*LOAD_FACTOR) { this.rehashing();}
        int index = this.keyToIndex(key);
        List<Cell<K, List<V>>> bucket = buckets[index];
        if (bucket == null) {
            buckets[index] = new ArrayList<Cell<K, List<V>>>();
        }
        for (Cell<K, List<V>> cell : buckets[index]) {
            if (cell.keyEquals(key)) { //use method in cell class=>  cell.keyEquals(key)
                List<V> currentV = (List<V>) cell.getValue();
                currentV.add(value);  //update
                return currentV;
            }
        }

        ArrayList<V> vals = new ArrayList<V>();
        vals.add(value);
        buckets[index].add(new Cell(key, vals)); //inserts
        this.size ++;
        return vals;
    }

    public boolean remove(K key) {
        int index = this.keyToIndex(key);
        ArrayList<Cell<K, List<V>>> bucket = buckets[index];
        if (bucket == null) {
            return false;
        }
        int i = 0;
        for (i=0; i<bucket.size(); i++) {
            if (bucket.get(i).keyEquals(key)) {  // null == null, return true
                // arraylist removal. needs to pass in index
                hashMapDesign.multimap.Cell<K, List<V>> cell =  bucket.remove(i); //remove
                System.out.println("removing from bucket,  key: " + key + ",  value: " +  cell.getValue());
                this.size --;
                return true;
            }
        }
        return false;
    }
    
    //asMap, convert Multimap to hashmap data structure
    //Multiple = > Map<K,List<V>> / Map<K,Collection<V>>
    public Map<K,Collection<V>> asMap(){
        HashMap<K,Collection<V>> myMap = new HashMap<K,Collection<V>>();
        for (ArrayList<Cell<K,List<V>>> bucket : buckets) {
           if (bucket == null) {
               continue;
           }
           for (Cell<K, List<V>> cell : bucket) {
               myMap.put(cell.getKey(), (List<V>) cell.getValue());
           }
       }
       return myMap; 
    }

    private void rehashing() {
        capacity *= 2;
        ArrayList<Cell<K, List<V>>>[] newBuckets = new ArrayList[capacity];
        for (ArrayList<Cell<K, List<V>>> bucket : this.buckets) {
                for (Cell<K, List<V>> cell : bucket) {
                    int index = this.keyToIndex(cell.getKey());
                    if (newBuckets[index] == null){
                        newBuckets[index] = new ArrayList<Cell<K,List<V>>>() ;              
                    }
                    newBuckets[index].add(cell);
                }          
        }
        this.buckets = newBuckets;
    }
    
}
