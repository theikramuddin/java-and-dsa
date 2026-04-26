import java.util.*;

public class StackandQueueUsingDeque {

    //Stack using Deque
    static class Stack {
    
        Deque<Integer> deque = new LinkedList<>();
        
        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    //Queue using Deque
    static class Queue {
    
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
        
    }
    public static void main(String[] args) {
        
        // Stack s = new Stack();
        Queue q = new Queue();

        // s.push(1);
        // s.push(2);
        // s.push(3);
        q.add(1);
        q.add(2);
        q.add(3);

        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
