package utilityDemoTest.collectionTest;

import java.util.*;

public class collectionInterface {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("Banana");
        list.add("Banana");
        list.add("Banana");

        list.remove("Mango");
        System.out.println("After remove: " + list);

        Collection<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Collection<Integer> moreNumbers=new ArrayList<>();
        moreNumbers.add(4);
        moreNumbers.add(5);
        numbers.addAll(moreNumbers);
        System.out.println("After adding elements: " + numbers);


        Collection<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding elements: " + fruits);
        fruits.remove("Orange");
        System.out.println("After removing elements: " + fruits);

        Collection<String> toRemove=new ArrayList<>();
        toRemove.add("Banana");
        toRemove.add("Apple");
        fruits.removeAll(toRemove);
        System.out.println("After removing elements: " + fruits);


        List<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Colors List: " + colors);

        String firstColor=colors.get(0);
        String lastColor=colors.get(colors.size()-1);

        System.out.println("First Color: " + firstColor);
        System.out.println("Last Color: " + lastColor);


        Collection<String> fruits2=new ArrayList<>(Arrays.asList("Apple","Banana","Mango"));

    Iterator<String> it= fruits2.iterator();
    while(it.hasNext()){
    String fruit2=it.next();
    if(fruits2.equals("Banana")){
    it.remove();
    }
    }
    System.out.println("After removing elements: " + fruits2);


        List<String> colors2=new ArrayList<>(Arrays.asList("Red","Green","Blue"));
        ListIterator<String> listIt=colors2.listIterator();
        System.out.print("forward:");
        while(listIt.hasNext()){
            String color2=listIt.next();
            if(color2.equals("Green")){
                listIt.set("Yellow");
            }
        }
        System.out.print("\nBackend");
        while(listIt.hasPrevious()){
            String color=listIt.previous();
        }
    }



}
