package hashMapDesign;

/**
 *
 */
public class HashMapApp {

    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();
        String[] keys = {"abc", "xyz", "abc", "xy", "z", null};
        Integer[] vals = {1, 2, 3, 4, null, 5};

        int len = keys.length;

        for (int i = 0; i < len; i++) {
            myMap.put(keys[i], vals[i]);
        }

        System.out.println("key = abc, value =  " + myMap.get("abc"));
        System.out.println("key = null, value =  " + myMap.get(null));

        System.out.println("=====removing by key = abc and key = null");
        myMap.remove("abc");
        myMap.remove(null);
        System.out.println("key = abc, value =  " + myMap.get("abc"));
        System.out.println("key = null, value =  " + myMap.get(null));

        //compare hashcode, same in this case (same string has the same hashcode)
        Cell cell1 = new Cell(new String("test"), 1);
        System.out.println("hashcode for cell 1 =  " + cell1.hashCode());
        Cell cell2 = new Cell("test", 2);
        System.out.println("hashcode for cell 2 =  " + cell2.hashCode());

    }

}
