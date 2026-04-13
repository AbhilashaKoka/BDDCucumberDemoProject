package utilityDemoTest.collectionTest;

import java.util.*;

public class LinkedListMethodsDemo {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Java"); // 1. add() - append element
        list.add("Python");
        list.add("C++");
        System.out.println("After add: " + list);
        list.add(1, "Go"); // 2. add(index, element) - insert at position
        System.out.println("After add at index: " + list);
        list.addFirst("Rust"); // 3. addFirst() / addLast()
        list.addLast("Kotlin");
        System.out.println("After addFirst/addLast: " + list);
        list.offer("Scala");// 4. offer() methods (queue-style)
        list.offerFirst("Swift");
        list.offerLast("Ruby");
        System.out.println("After offer methods: " + list); // 5. get() methods
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Peek: " + list.peek());// 6. peek() methods (retrieve without removing)
        System.out.println("PeekFirst: " + list.peekFirst());
        System.out.println("PeekLast: " + list.peekLast());// 7. remove() methods
        list.remove(); // removes first
        list.remove(2); // removes element at index
        list.remove("Scala"); // removes by value
        list.removeFirst();
        list.removeLast();
        System.out.println("After remove methods: " + list);
        System.out.println("Poll: " + list.poll()); // 8. poll() methods (retrieve and remove)
        System.out.println("PollFirst: " + list.pollFirst());
        System.out.println("PollLast: " + list.pollLast());
        System.out.println("After poll methods: " + list);// 9. contains(), size(), isEmpty()
        System.out.println("Contains Java? " + list.contains("Java"));
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());
        System.out.print("Iterating with for-each: "); // 10. Iteration
        for (String lang : list) { System.out.print(lang + " ");  }
        System.out.println();
        list.clear();
        System.out.println("After clear: " + list);
        String[] languages = {"Java", "Python", "C++"};
        List<String> list2 = Arrays.asList(languages); // Convert array to list
        System.out.println("List: " + list);
        List<String> list3 = new ArrayList<>();
        list3.add("Java");
        list3.add("Python");
        list3.add("C++");
        String[] array = list2.toArray(new String[0]);// Convert list to array
        System.out.println("Array elements:");
        for (String lang : array) { System.out.println(lang);  }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=1;i<=5;i++) al.add(i);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+"");
        }
       LinkedList<Integer> li=new LinkedList<Integer>();
        for(int j=1;j<=5;j++) {
            li.add(j);
            System.out.println(li);
            li.remove(3);
            System.out.println(li);
            li.remove(3);
            System.out.println(li);
            for (int i = 0; i < li.size(); i++) {
                System.out.print(li.get(i) + "");
            }
        }
        Vector<Integer> v=new Vector<Integer>();
        for(int z=1;z<=5;z++)
        {
            v.add(z);
            System.out.println(v);
            v.remove(z);
            System.out.println(v);
            for(int k=0;k<v.size();k++)
                System.out.println(v.get(k)+" ");
        }
        Stack<String> stack=new Stack<String>();
        stack.push("java");
        stack.push("python");
        stack.push("Greeks");
        stack.push("Greeks");
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
        System.out.println();
        stack.pop();
        itr=stack.iterator();
        while(itr.hasNext()){System.out.print(itr.next()+" ");}
        PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
        pQueue.add(1);
        pQueue.add(2);
        pQueue.add(3);
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
        ArrayDeque<Integer> de_que=new ArrayDeque<Integer>(10);
        de_que.add(1);
        de_que.add(2);
        de_que.add(3);
        de_que.add(4);
        System.out.println(de_que);
        de_que.clear();
        de_que.addFirst(564);
        de_que.addFirst(291);
        de_que.addLast(345);
        de_que.addLast(345);
        System.out.println(de_que);
            }


   public void ReversedLinkedList() {
                LinkedList<Integer> ll = new LinkedList<>();
                ll.add(1);
                ll.add(2);
                ll.add(3);
                System.out.println(ll);
                LinkedList<Integer> ll1 = new LinkedList<>();
                ll.descendingIterator().forEachRemaining(ll1::add);
                System.out.println(ll1);
            }


 }
