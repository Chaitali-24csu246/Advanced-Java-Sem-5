import java.util.PriorityQueue;
public class priorityqueuepractice {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.add(1);
        priorityQueue.add(2);
        /* add vs offer 
        the difference between add and offer is that add throws an exception if
         the queue is full, while offer returns false */
        priorityQueue.remove();
        if(priorityQueue.isEmpty()) {
            System.out.println("Priority Queue is empty");
        } else {
            System.out.println("Priority Queue is not empty");
        }
        //peek
        System.out.println("Front element is: " + priorityQueue.peek());
        System.out.println("Size of priority queue is: " + priorityQueue.size());
        //priority queue traversal
        System.out.println("Priority Queue elements are: ");
        for(Integer element : priorityQueue)
        {
            System.out.println(element);
        }
        //poll
        System.out.println("Removed element is: " + priorityQueue.poll());
        //poll handles underflow by returning null if the queue is empty, while remove throws an exception
    }    
}
