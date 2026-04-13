package utilityDemoTest.collectionTest;

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


        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("For");
        hs.add("Python");
        hs.add("Java");
        hs.add("Python");

        Iterator<String> it2 = hs.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());

        }

        LinkedHashSet<String> ihs = new LinkedHashSet<String>();
        ihs.add("Java");
        ihs.add("For");
        ihs.add("Python");

        ihs.add("Python");
        ihs.add("Java");
        Iterator<String> itr = ihs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Java");
        ts.add("For");
        ts.add("Python");
        ts.add("Java");
        ts.add("Python");
        Iterator<String> itr3 = ts.iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());



    }

}
