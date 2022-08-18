package datastructures.linear;

import java.util.*;

public class QueueExample {

    public static void main(String[] arg){

        /*
        Since Queue is an interface, It requires a concrete class for the declaration.
        The most common classes are the LinkedList and PriorityQueue and ArrayDeque
        Methods of Java Queue Interface

        * boolean add(object)
            - It is used to insert the specified element into this queue and return true upon success.
        * boolean offer(object)
            - It is used to insert the specified element into this queue.
        * Object remove()
            - It is used to retrieves and removes the head of this queue.
        * Object poll()
            - It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
        * Object element()
            - It is used to retrieves, but does not remove, the head of this queue.
        * Object peek()
            - It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
         */

        //Queue implementation Using One Dimensional Array
        OneDimensionalArrayAsAQueue qu1 = new OneDimensionalArrayAsAQueue(5);
        qu1.runQueue();

        QueueExampleRun pq = new QueueExampleRun(new PriorityQueue<>());
        pq.runQueue();
        QueueExampleRun ad = new QueueExampleRun(new ArrayDeque<>());
        ad.runQueue();
        QueueExampleRun ll = new QueueExampleRun(new LinkedList<>());
        ll.runQueue();
    }
}

class QueueExampleRun extends CommonMethods{

    QueueExampleRun(Queue<Integer> queue) {
        super(queue);
    }

    public void runQueue(){
        addData();
        displayData();
        Scanner scanner = new Scanner(System.in);
        int val = 0;
        do {
            System.out.println();
            System.out.print("Enter Value : ");
            val = scanner.nextInt();
            addSingleItemToQueue(val);
            displayData();
        } while (val!=99);

        int exit = 1;
        do {
            exit = scanner.nextInt();
            removeItemFromQueue();
            // displayData();
        } while(exit!=0);
    }
}

class OneDimensionalArrayAsAQueue{
    int startPointer,endPointer;
    int queueSize;
    static int[] q1;

    OneDimensionalArrayAsAQueue(){
        startPointer = 0;
        endPointer = 0;
        queueSize = 5;
    }

    OneDimensionalArrayAsAQueue(int size){
        queueSize = size;
        q1 = new int[queueSize];
    }

    void runQueue(){
        for (int i=0;i<5;i++)
            enQueue((int) Math.round(Math.random()*100));
        display();
        deQueue();
        display();
        deQueue();
        display();
        deQueue();
        display();
        deQueue();
        display();
        deQueue();
        display();
        deQueue();
    }

    /*
    Used for insert Data
    Logic - if it isn't full ( array size = endPointer ),
    insert data to the array and increase pointer by 1
     */
    void enQueue(int value){
        if(queueSize==endPointer){
            System.out.println("Queue is full");
        } else {
            q1[startPointer] = value;
            startPointer++;
        }
    }

    /*
    Used for remove Item from the Queue
    Since Queue are FIFO( First In First Out ), Removing should start from the begging of the array
    All other items should shifted to 1 position up
     */
    void deQueue(){
        if(startPointer==0){
            System.out.println("Queue is empty");
        } else {
            for (int i=0;i<startPointer-1;i++)
                q1[i] = q1[i+1];
            startPointer--;
        }
    }

    void display(){
        if(startPointer==0){
            System.out.println("Queue is empty");
        } else {
            System.out.println();
            for (int i=0;i<startPointer;i++) {
                System.out.println(q1[i]);
            }
        }
    }
}

abstract class CommonMethods{
    Queue<Integer> queue;

    CommonMethods(Queue<Integer> queue){
        this.queue = queue;
    }

    public void addData(){
        //Adding Data to Queue
        for (int i=0;i<5;i++)
            queue.add(((int) Math.round(Math.random()*100)));
    }

    public void removeItemFromQueue(){
        System.out.println("Removing Item using remove = "+queue.remove());

        System.out.println("Removing Item using poll = "+queue.poll());
    }

    public void viewTopItemInQueue(){
        System.out.println("View top item using element = "+queue.element());

        System.out.println("View top item using peek = "+queue.peek());
    }

    public void addSingleItemToQueue(int value){
        //Add Item to Queue
        if(queue.add(value)) System.out.println("Added Item to Queue using Add method "); else System.out.println("Error in Adding Data to Queue");

        //Add data using offer method
        if(queue.offer(value)) System.out.println("Added Item to Queue using offer method"); else System.out.println("Error in Adding Data to Queue");
    }

    public void displayData(){
        System.out.println();
        System.out.println("Queue Size: " + queue.size());

        System.out.println("Queue is empty: " + queue.isEmpty());

        System.out.println("----------------------------------------------------");
        System.out.println("Display Data using Iterator");
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next());
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Display Data using for");
        for (Integer queueItem : queue) System.out.println(queueItem);
        System.out.println("----------------------------------------------------");
    }
}


