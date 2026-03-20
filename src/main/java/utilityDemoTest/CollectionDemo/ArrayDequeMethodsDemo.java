package utilityDemoTest.CollectionDemo;

import java.util.*;

public class ArrayDequeMethodsDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // 1. add() - append element
        deque.add("Java");
        deque.add("Python");
        deque.add("C++");
        System.out.println("After add: " + deque);

        // 2. addFirst() / addLast()
        deque.addFirst("Rust");
        deque.addLast("Kotlin");
        System.out.println("After addFirst/addLast: " + deque);

        // 3. offer() methods (queue-style)
        deque.offer("Scala");
        deque.offerFirst("Swift");
        deque.offerLast("Ruby");
        System.out.println("After offer methods: " + deque);

        // 4. peek() methods (retrieve without removing)
        System.out.println("Peek: " + deque.peek());
        System.out.println("PeekFirst: " + deque.peekFirst());
        System.out.println("PeekLast: " + deque.peekLast());

        // 5. getFirst() / getLast()
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // 6. remove() methods
        deque.remove(); // removes first
        deque.remove("Scala"); // removes by value
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After remove methods: " + deque);

        // 7. poll() methods (retrieve and remove)
        System.out.println("Poll: " + deque.poll());
        System.out.println("PollFirst: " + deque.pollFirst());
        System.out.println("PollLast: " + deque.pollLast());
        System.out.println("After poll methods: " + deque);

        // 8. push() / pop() (stack-style)
        deque.push("C#"); // push = addFirst
        deque.push("Go");
        System.out.println("After push: " + deque);
        System.out.println("Pop: " + deque.pop()); // pop = removeFirst
        System.out.println("After pop: " + deque);

        // 9. contains(), size(), isEmpty()
        System.out.println("Contains Java? " + deque.contains("Java"));
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());

        // 10. Iteration
        System.out.print("Iterating: ");
        for (String lang : deque) {
            System.out.print(lang + " ");
        }
        System.out.println();

        // 11. clear()
        deque.clear();
        System.out.println("After clear: " + deque);
    }
}