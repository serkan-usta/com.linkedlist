import java.util.LinkedList;
import java.util.Deque;

class Main6 {
    public static void main(String[] args){
        Deque<String> animals = new LinkedList<>();

        // add element at the beginning
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);

        // add elements at the end
        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        // remove the first element
        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        // remove the last element
        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);
    }
}
/*

== Output ==

        LinkedList: [Cow]
        LinkedList after addFirst(): [Dog, Cow]
        LinkedList after addLast(): [Dog, Cow, Zebra]
        LinkedList after removeFirst(): [Cow, Zebra]
        LinkedList after removeLast(): [Cow]

        */
