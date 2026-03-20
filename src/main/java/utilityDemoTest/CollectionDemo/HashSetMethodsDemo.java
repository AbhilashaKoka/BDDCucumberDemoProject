package utilityDemoTest.CollectionDemo;

import java.util.*;

public class HashSetMethodsDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 1. add() - add elements (duplicates ignored)
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate ignored
        System.out.println("After add: " + set);

        // 2. addAll() - add multiple elements
        set.addAll(Arrays.asList("Go", "Rust", "Kotlin"));
        System.out.println("After addAll: " + set);

        // 3. contains() - check existence
        System.out.println("Contains Python? " + set.contains("Python"));

        // 4. remove() - remove element
        set.remove("Rust");
        System.out.println("After remove: " + set);

        // 5. removeAll() - remove multiple elements
        set.removeAll(Arrays.asList("Go", "Kotlin"));
        System.out.println("After removeAll: " + set);

        // 6. size() - number of elements
        System.out.println("Size: " + set.size());

        // 7. isEmpty() - check if empty
        System.out.println("Is empty? " + set.isEmpty());

        // 8. iterator() - iterate through elements
        System.out.print("Iterating: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 9. clear() - remove all elements
        set.clear();
        System.out.println("After clear: " + set);
    }
}
