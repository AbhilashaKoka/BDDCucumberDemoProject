package utilityDemoTest.collectionTest;

import java.util.*;

public class PriorityQueueMethodsDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. add() - insert element
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("After add: " + pq);

        // 2. offer() - insert element (returns true/false)
        pq.offer(40);
        System.out.println("After offer: " + pq);

        // 3. peek() - retrieve head without removing
        System.out.println("Peek: " + pq.peek());

        // 4. element() - similar to peek(), but throws exception if empty
        System.out.println("Element: " + pq.element());

        // 5. poll() - retrieve and remove head
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll: " + pq);

        // 6. remove() - remove head or specific element
        pq.remove(); // removes head
        pq.remove(40); // removes specific element
        System.out.println("After remove: " + pq);

        // 7. contains() - check existence
        System.out.println("Contains 20? " + pq.contains(20));

        // 8. size() / isEmpty()
        System.out.println("Size: " + pq.size());
        System.out.println("Is empty? " + pq.isEmpty());

        // 9. iterator() - iterate (not guaranteed sorted order)
        System.out.print("Iterating: ");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 10. clear() - remove all elements
        pq.clear();
        System.out.println("After clear: " + pq);
    }
}
