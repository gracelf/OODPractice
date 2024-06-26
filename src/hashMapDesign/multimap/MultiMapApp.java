package hashMapDesign.multimap;

import hashMapDesign.*;

/**
 *
 */
public class MultiMapApp {

    public static void main(String[] args) {
        MyMultiMap myMap = new MyMultiMap();
        String[] keys = {"abc", "xyz", "abc", "xy", "z", null};
        Integer[] vals = {1, 2, 3, 4, null, 5};

        int len = keys.length;

        for (int i = 0; i < len; i++) {
            myMap.put(keys[i], vals[i]);
        }

        System.out.println("=====testing multi map ");
        //return address
        System.out.println("Multi Map:  " + myMap);

        System.out.println("key = abc, value =  " + myMap.get("abc"));
        System.out.println("key = null, value =  " + myMap.get(null));

        System.out.println("=====removing by key = abc and key = null");
        myMap.remove("abc");
        myMap.remove(null);
        System.out.println("key = abc, value =  " + myMap.get("abc"));
        System.out.println("key = null, value =  " + myMap.get(null));

        System.out.println("=====testing asMap ");
        //return content, not the address
        System.out.println("as Map:  " + myMap.asMap());

    }

}
