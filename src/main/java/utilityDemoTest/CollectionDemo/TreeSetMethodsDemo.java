package utilityDemoTest.CollectionDemo;

import java.util.*;

public class TreeSetMethodsDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // 1. add() - add elements (duplicates ignored, sorted order maintained)
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

        // 4. first() / last() - smallest & largest
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // 5. higher() / lower() - navigation
        System.out.println("Higher than 'Java': " + set.higher("Java"));
        System.out.println("Lower than 'Java': " + set.lower("Java"));

        // 6. ceiling() / floor() - closest matches
        System.out.println("Ceiling of 'J': " + set.ceiling("J"));
        System.out.println("Floor of 'J': " + set.floor("J"));

        // 7. headSet() / tailSet() / subSet()
        System.out.println("HeadSet(<Python): " + set.headSet("Python"));
        System.out.println("TailSet(>=Python): " + set.tailSet("Python"));
        System.out.println("SubSet(Java to Rust): " + set.subSet("Java", "Rust"));

        // 8. remove() - remove element
        set.remove("Rust");
        System.out.println("After remove: " + set);

        // 9. pollFirst() / pollLast() - retrieve and remove
        System.out.println("PollFirst: " + set.pollFirst());
        System.out.println("PollLast: " + set.pollLast());
        System.out.println("After pollFirst/pollLast: " + set);

        // 10. size() / isEmpty()
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        // 11. iterator() - iterate in ascending order
        System.out.print("Iterating ascending: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 12. descendingIterator() - iterate in descending order
        System.out.print("Iterating descending: ");
        Iterator<String> dit = set.descendingIterator();
        while (dit.hasNext()) {
            System.out.print(dit.next() + " ");
        }
        System.out.println();

        // 13. clear() - remove all elements
        set.clear();
        System.out.println("After clear: " + set);
    }
}
