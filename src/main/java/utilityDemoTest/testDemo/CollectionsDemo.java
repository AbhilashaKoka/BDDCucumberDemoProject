package utilityDemoTest.testDemo;


    import java.util.*;

    public class CollectionsDemo {
        public static void main(String[] args) {
    //---------------------------------------------------------------------//
            // List implementations
            List<String> arrayList = new ArrayList<>();
            arrayList.add("Java");
            arrayList.add("Python");
            arrayList.add("C++");
            System.out.println("ArrayList: " + arrayList);

            List<String> linkedList = new LinkedList<>();
            linkedList.add("Spring");
            linkedList.add("Hibernate");
            System.out.println("LinkedList: " + linkedList);
//-----------------------------------------------------------------------------//
            // Set implementations
            Set<Integer> hashSet = new HashSet<>();
            hashSet.add(10);
            hashSet.add(20);
            hashSet.add(10); // duplicate ignored
            System.out.println("HashSet: " + hashSet);

            Set<Integer> treeSet = new TreeSet<>();
            treeSet.add(5);
            treeSet.add(1);
            treeSet.add(3);
            System.out.println("TreeSet (sorted): " + treeSet);
//--------------------------------------------------------------------------------//
            // Queue implementations
            Queue<String> priorityQueue = new PriorityQueue<>();
            priorityQueue.add("C");
            priorityQueue.add("A");
            priorityQueue.add("B");
            System.out.println("PriorityQueue: " + priorityQueue);

            Deque<String> arrayDeque = new ArrayDeque<>();
            arrayDeque.add("First");
            arrayDeque.add("Second");
            arrayDeque.add("Third");
            System.out.println("ArrayDeque: " + arrayDeque);
//-------------------------------------------------------------------------------//
            // Map implementations
            Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Alice", 25);
            hashMap.put("Bob", 30);
            System.out.println("HashMap: " + hashMap);

            Map<String, Integer> treeMap = new TreeMap<>();
            treeMap.put("X", 100);
            treeMap.put("A", 200);
            System.out.println("TreeMap (sorted keys): " + treeMap);

            Map<String, Integer> hashtable = new Hashtable<>();
            hashtable.put("Key1", 1);
            hashtable.put("Key2", 2);
            System.out.println("Hashtable: " + hashtable);
//================================================================//
        String[] languages = {"Java", "Python", "C++"};
        // Convert array to list
        List<String> list = Arrays.asList(languages);
        System.out.println("List: " + list);
//=================================================================//
            List<String> list2 = new ArrayList<>();
            list2.add("Java");
            list2.add("Python");
            list2.add("C++");
            // Convert List to Array
            String[] array = list2.toArray(new String[0]);
            // Print array elements
            System.out.println("Array elements:");
            for (String lang : array) {
                System.out.println(lang);
            }

        }


}
