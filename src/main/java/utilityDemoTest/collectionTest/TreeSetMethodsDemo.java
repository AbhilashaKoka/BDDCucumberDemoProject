package utilityDemoTest.collectionTest;
import java.util.*;

public class TreeSetMethodsDemo{
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<>();
        set.add("Java");// 1. add() - add elements (duplicates ignored, sorted order maintained)
        set.add("Python");
        set.add("C++");
        set.add("Java"); //duplicate ignored
        System.out.println("After add: " + set);
        set.addAll(Arrays.asList("Go", "Rust", "Kotlin"));// 2. addAll() - add multiple elements
        System.out.println("After addAll: " + set);
        System.out.println("Contains Python? " + set.contains("Python"));// 3. contains() - check existence
        System.out.println("First element: " + set.first());// 4. first() / last() - smallest & largest
        System.out.println("Last element: " + set.last());
        System.out.println("Higher than 'Java': " + set.higher("Java")); // 5. higher() / lower() - navigation
        System.out.println("Lower than 'Java': " + set.lower("Java"));
        System.out.println("Ceiling of 'J': " + set.ceiling("J"));// 6. ceiling() / floor() - closest matches
        System.out.println("Floor of 'J': " + set.floor("J"));
        System.out.println("HeadSet(<Python): " + set.headSet("Python"));   // 7. headSet() / tailSet() / subSet()
        System.out.println("TailSet(>=Python): " + set.tailSet("Python"));
        System.out.println("SubSet(Java to Rust): " + set.subSet("Java", "Rust"));
        set.remove("Rust");// 8. remove() - remove element
        System.out.println("After remove: " + set);
        System.out.println("PollFirst: " + set.pollFirst()); // 9. pollFirst() / pollLast() - retrieve and remove
        System.out.println("PollLast: " + set.pollLast());
        System.out.println("After pollFirst/pollLast: " + set);
        System.out.println("Size: " + set.size());// 10. size() / isEmpty()
        System.out.println("Is empty? " + set.isEmpty());
        System.out.print("Iterating ascending: ");// 11. iterator() - iterate in ascending order
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println( );
        System.out.print("Iterating descending: "); // 12. descendingIterator() - iterate in descending order
        Iterator<String> dit = set.descendingIterator();
        while (dit.hasNext()){
            System.out.print(dit.next() + " ");
        }
        System.out.println();
        set.clear();       // 13. clear() - remove all elements
        System.out.println("After clear: " + set);
    }
}
