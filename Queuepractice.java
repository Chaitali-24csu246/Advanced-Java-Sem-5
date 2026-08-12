import java.util.Queue;
public class Queuepractice {

    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.offer(10);
        queue.add(1);
        queue.add(2);
        /* add vs offer 
        the difference between add and offer is that add throws an exception if
         the queue is full, while offer returns false */
        queue.remove();
        if(queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
        //peek
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Size of queue is: " + queue.size());
        //queue traversal
        System.out.println("Queue elements are: ");
        for(Integer element : queue)
        {
            System.out.println(element);
        }
        //poll
        System.out.println("Removed element is: " + queue.poll());
        //poll handles underflow by returning null if the queue is empty, while remove throws an exception
        //element
        System.out.println("Front element is: " + queue.element());
    }
}
