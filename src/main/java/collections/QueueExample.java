package collections;

import java.util.LinkedList;
import java.util.Queue;
//                 kolejki
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Darek");
        queue.add("Wojtek");
        queue.offer("Darek");
        queue.offer("Wojtek");
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll()); //ddajemy się i usuwamy daną
        System.out.println(queue.peek());
        System.out.println(queue.peek()); //dostajemy się do danej
        System.out.println(queue.poll()); //ddajemy się i usuwamy daną


    }
}
