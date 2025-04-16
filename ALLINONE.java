import java.util.LinkedList;

public class ALLINONE {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Initial linked list: " + list);

        // Add elements at specific positions
        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After adding elements: " + list);

        // Remove elements
        list.remove("C");
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing elements: " + list);

        // Iterate through the list
        System.out.println("Iterating through the list:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}