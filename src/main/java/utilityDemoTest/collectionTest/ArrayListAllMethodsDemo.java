package utilityDemoTest.collectionTest;

import java.util.*;

public class ArrayListAllMethodsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 1. Add elements
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After add: " + list);
        // 2. Add at index
        list.add(1, "Go");
        System.out.println("After add at index: " + list);
        // 3. AddAll
        list.addAll(Arrays.asList("Rust", "Kotlin"));
        System.out.println("After addAll: " + list);
        // 4. Get element
        System.out.println("Element at index 2: " + list.get(2));
        // 5. Set element
        list.set(2, "Ruby");
        System.out.println("After set: " + list);
        // 6. Remove by index
        list.remove(3);
        System.out.println("After remove(index): " + list);
        // 7. Remove by object
        list.remove("Java");
        System.out.println("After remove(object): " + list);
        // 8. RemoveAll
        list.removeAll(Arrays.asList("Rust", "Kotlin"));
        System.out.println("After removeAll: " + list);
        // 9. Contains
        System.out.println("Contains Python? " + list.contains("Python"));
        // 10. IndexOf / LastIndexOf
        list.add("Python");
        System.out.println("IndexOf Python: " + list.indexOf("Python"));
        System.out.println("LastIndexOf Python: " + list.lastIndexOf("Python"));
        // 11. Size
        System.out.println("Size: " + list.size());
        // 12. isEmpty
        System.out.println("Is empty? " + list.isEmpty());
        // 13. SubList
        System.out.println("SubList(0,2): " + list.subList(0, 2));
        // 14. toArray
        String[] array = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));
        // 15. Iterator
        System.out.print("Iterating: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        } System.out.println();
        // 16. Clear
        list.clear();
        System.out.println("After clear: " + list);
    }
}