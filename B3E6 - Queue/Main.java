import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Main{
    public static void main(String[] args) {
        
        String[] array1 = {"Jorge", "João", "Jose", "Beth", "Carlos", "Michael"};
        String[] array2 = {"Jorge", "Kate", "Carlos", "Michelle", "Ryana"};

        Queue<String> queue = new LinkedList<>();
        insert(queue, array1);
        insert(queue, array2);
        //printQueue(queue);
        //printDeque(queue);
        reverseQueue(queue);
        print(queue);
    }

    public static void insert(Queue<String> queue, String[] array) {

        for (String current : array) {
            queue.add(current);
        }
    }

    public static void printDeque(Queue<String> queue) {

        Deque<String> deque = new LinkedList<>();
        int size = queue.size();

        System.out.println("\n --- In-order  --- \n");

        for (int i = 0; i < size; i++) {
            System.out.println("Element[" + i + "] = " + queue.peek());
            deque.add(queue.poll());
        }

        System.out.println("\n --- Inverse  --- \n");

        for (int i = size - 1; deque.peek() != null; i--) {
            System.out.println("Element[" + i + "] = " + deque.pollLast());
        }
    }

    public static void printQueue(Queue<String> queue) {

        LinkedList<String> list = new LinkedList<>();
        int queueSize = queue.size();

        System.out.println("\n --- In-order  --- \n");

        for (int i = 0; i < queueSize; i++) {
            System.out.println("Element[" + i + "] = " + queue.peek());
            list.add(queue.poll());
        }

        System.out.println("\n --- Inverse  --- \n");

        for (int i = list.size() - 1; list.peek() != null; i--) {
            System.out.println("Element[" + i + "] = " + list.pollLast());
        }
    }

    public static void print(Queue<String> queue) {

        for (String current : queue) {
            System.out.println("Element = " + current);
        }
    }

    static void reverseQueue(Queue<String> queue)
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
}