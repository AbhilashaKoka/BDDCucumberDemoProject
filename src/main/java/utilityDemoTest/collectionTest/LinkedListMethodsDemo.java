package utilityDemoTest.collectionTest;

import java.util.*;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. add() - append element
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("After add: " + list);

        // 2. add(index, element) - insert at position
        list.add(1, "Go");
        System.out.println("After add at index: " + list);

        // 3. addFirst() / addLast()
        list.addFirst("Rust");
        list.addLast("Kotlin");
        System.out.println("After addFirst/addLast: " + list);

        // 4. offer() methods (queue-style)
        list.offer("Scala");
        list.offerFirst("Swift");
        list.offerLast("Ruby");
        System.out.println("After offer methods: " + list);

        // 5. get() methods
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // 6. peek() methods (retrieve without removing)
        System.out.println("Peek: " + list.peek());
        System.out.println("PeekFirst: " + list.peekFirst());
        System.out.println("PeekLast: " + list.peekLast());

        // 7. remove() methods
        list.remove(); // removes first
        list.remove(2); // removes element at index
        list.remove("Scala"); // removes by value
        list.removeFirst();
        list.removeLast();
        System.out.println("After remove methods: " + list);

        // 8. poll() methods (retrieve and remove)
        System.out.println("Poll: " + list.poll());
        System.out.println("PollFirst: " + list.pollFirst());
        System.out.println("PollLast: " + list.pollLast());
        System.out.println("After poll methods: " + list);

        // 9. contains(), size(), isEmpty()
        System.out.println("Contains Java? " + list.contains("Java"));
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());

        // 10. Iteration
        System.out.print("Iterating with for-each: ");
        for (String lang : list) {
            System.out.print(lang + " ");
        }
        System.out.println();

        // 11. clear()
        list.clear();
        System.out.println("After clear: " + list);


        //================================================================//
        String[] languages = {"Java", "Python", "C++"};
        // Convert array to list
        List<String> list2 = Arrays.asList(languages);
        System.out.println("List: " + list);
        //=================================================================//
        List<String> list3 = new ArrayList<>();
        list3.add("Java");
        list3.add("Python");
        list3.add("C++");
        // Convert List to Array
        String[] array = list2.toArray(new String[0]);
        // Print array elements
        System.out.println("Array elements:");
        for (String lang : array) {
            System.out.println(lang);
        }
    }
}
