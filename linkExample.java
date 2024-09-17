import java.util.LinkedList;

public class linkExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("A"); //adds to the end of the link
        ll.add("B");
        ll.addFirst("C"); //adds to the beginning of the link
        ll.addLast("D"); //adds to the end of the link
        ll.add(2,"E"); //adds at position 2
        ll.remove(3); //removes at position 3
        ll.remove(); //removes the first node
        ll.set(2,"Z"); //replaces position 2 with new element
        ll.remove("E"); //removes element if in list
        // ll.clear(); // clears list


        System.out.println(ll);


    }
}
