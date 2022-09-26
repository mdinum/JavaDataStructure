package datastructures.linear;

import java.util.*;
import java.util.stream.Collectors;

public class LinkListExample {
    public static void main(String[] arg){
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i=0;i<10;i++)
        //Adding data
        ll.add((int) Math.round(Math.random()*100));

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, 55);
        System.out.println("Updated LinkedList " + ll);

        ll.add(1, 66);
        System.out.println("Updated LinkedList " + ll);

        ll.addFirst(11);
        ll.addLast(99);
        System.out.println("After Adding the first and Last Element" + ll);

        ll.remove(3);
        System.out.println("After the Index Removal " + ll);

        ll.remove("99");
        System.out.println("After the Object Removal " + ll);

        //Removing first and last element from the array
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After Adding the first and Last Element" + ll);

        //Searching Item in the Array
        System.out.println(((ll.contains(45))?"45 found":"45 not found"));

        //Iterate linklist
        //using for loop
        for (int j=0;j<ll.size();j++)
            System.out.print(ll.get(j)+",");
        System.out.println();
        //Using Iterator
        Iterator it = ll.iterator();
        while (it.hasNext())
            System.out.print(it.next()+",");
    }
}
