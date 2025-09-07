package practicequestions;
import java.util.LinkedList;

//Queue
//Implement a Queue<Integer> using LinkedList. Add 3 numbers, remove one, and print the remaining queue.
public class Question19 {
    public static void main(String[] args) {
        MyQueue<Integer> q1= new MyQueue<>();
        MyQueue<String> q2= new MyQueue<>();

        q2.Enqueue("raman");
        q2.Enqueue("aman");
        q2.Enqueue("man");
        q2.Enqueue("an");
        q2.Enqueue("n");
        q1.Enqueue(113);
        q1.Enqueue(123);
        q1.Enqueue(143);
        q1.Enqueue(163);
        System.out.println(q1.Dequeue());
        System.out.println(q1.Dequeue());
        System.out.println(q1.Dequeue());
        System.out.println(q2.Dequeue());
        System.out.println(q2.Dequeue());
        System.out.println(q2.Dequeue());
        System.out.println(q2.Dequeue());
    }
}

class MyQueue<T> {
    private LinkedList<T> linkedList;
    private int length;

    public MyQueue() {
        linkedList = new LinkedList<>();
        length = 0;
    }

    public void Enqueue(T element) {
        linkedList.addLast(element);
        length++;
    }

    public T Dequeue() {
        T remove = linkedList.removeFirst();
        length--;
        return remove;
    }

    public int getLength() {
        return length;
    }
}