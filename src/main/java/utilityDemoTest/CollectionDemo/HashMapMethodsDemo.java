package utilityDemoTest.CollectionDemo;

import java.util.*;

public class HashMapMethodsDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // 1. put() - add key-value pairs
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);
        System.out.println("After put: " + map);
        // 2. putIfAbsent() - add only if key not present
        map.putIfAbsent("Rust", 4);
        map.putIfAbsent("Java", 10); // ignored since Java already exists
        System.out.println("After putIfAbsent: " + map);
       // 3. get() - retrieve value by key
        System.out.println("Get Python: " + map.get("Python"));
        // 4. getOrDefault() - retrieve value or default if key missing
        System.out.println("GetOrDefault Go: " + map.getOrDefault("Go", -1));
        // 5. containsKey() / containsValue()
        System.out.println("ContainsKey Java? " + map.containsKey("Java"));
        System.out.println("ContainsValue 3? " + map.containsValue(3));
        // 6. remove() - remove by key
        map.remove("C++");
        System.out.println("After remove(C++): " + map);
        // 7. replace() - update value
        map.replace("Python", 20);
        System.out.println("After replace: " + map);
        // 8. keySet() - get all keys
        System.out.println("Keys: " + map.keySet());
        // 9. values() - get all values
        System.out.println("Values: " + map.values());
        // 10. entrySet() - get all key-value pairs
        System.out.println("Entries: " + map.entrySet());
        // 11. forEach() - iterate with lambda
        System.out.print("Iterating with forEach: ");
        map.forEach((k, v) -> System.out.print(k + "=" + v + " "));
        System.out.println();
        // 12. size() / isEmpty()
        System.out.println("Size: " + map.size());
        System.out.println("Is empty? " + map.isEmpty());
        // 13. clear() - remove all entries
        map.clear();
        System.out.println("After clear: " + map);
    }
}