package hashMapDesign;

import java.util.ArrayList;

/**
 *
 */
public class MyHashMap<K, V> {

    private ArrayList<Cell<K, V>>[] buckets;
    private static final double LOAD_FACTOR = 0.75d;
    private int capacity = 256;
    private int size;

    public MyHashMap() {
        this.buckets = new ArrayList[capacity];
        size = 0;
    }

    public int keyToIndex(K key) {
        return key == null ? 0 : Math.abs(key.hashCode() % capacity);
    }

    public V get(K key) {
        int index = this.keyToIndex(key);
        ArrayList<Cell<K, V>> bucket = buckets[index];
        for (Cell<K, V> cell : bucket) {
            if (cell.keyEquals(key)) { //need to override to handle key == null
                return cell.getValue();
            }
        }
        return null;
    }

    public V put(K key, V value) {
        if (this.size >= capacity * LOAD_FACTOR) {
            this.rehashing();
        }
        int index = this.keyToIndex(key);
        ArrayList<Cell<K, V>> bucket = buckets[index];
        if (bucket == null) {
            buckets[index] = new ArrayList<Cell<K, V>>();
        }
        for (Cell<K, V> cell : buckets[index]) {
            if (cell.keyEquals(key)) { //use method in cell class=>  cell.keyEquals(key)
                V currentV = cell.getValue();
                cell.setValue(value);  //update
                return currentV;
            }
        }

        buckets[index].add(new Cell(key, value)); //inserts
        this.size++;
        return null;
    }

    public boolean remove(K key) {
        int index = this.keyToIndex(key);
        ArrayList<Cell<K, V>> bucket = buckets[index];
        if (bucket == null) {
            return false;
        }
        int i = 0;
        for (i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).keyEquals(key)) {  // null == null, return true
                // arraylist removal. needs to pass in index
                Cell<K, V> cell = bucket.remove(i); //remove
                System.out.println("removing from bucket,  key: " + key + ",  value: " + cell.getValue());
                this.size--;
                return true;
            }
        }
        return false;
    }

    private void rehashing() {
        capacity *= 2;
        ArrayList<Cell<K, V>>[] newBuckets = new ArrayList[capacity];
        for (ArrayList<Cell<K, V>> bucket : this.buckets) {
            for (Cell<K, V> cell : bucket) {
                int index = this.keyToIndex(cell.getKey());
                if (newBuckets[index] == null) {
                    newBuckets[index] = new ArrayList<Cell<K, V>>();
                }
                newBuckets[index].add(cell);
            }
        }
        this.buckets = newBuckets;
    }

}
