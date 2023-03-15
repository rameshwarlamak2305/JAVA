package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(25);
        list.add(30);
        list.add(70);
        list.add(80);

        // Traverse Using toString
        System.out.println(list.toString());

        // Traverse Using ForEach
        list.forEach(a -> System.out.print(a + " "));
        System.out.println();

        // Traverse Using Normal Forloop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Traverse Using Iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Traverse Using ListIterator
        ListIterator<Integer> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }

    }
}