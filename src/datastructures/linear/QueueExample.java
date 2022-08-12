package datastructures.linear;

public class QueueExample {
    public static void main(String[] arg){
        OneDimensionalArrayAsAQueue qu1 = new OneDimensionalArrayAsAQueue(5);
        for (int i=0;i<5;i++)
            qu1.enQueue((int) Math.round(Math.random()*100));
        qu1.display();
        qu1.deQueue();
        qu1.display();
        qu1.deQueue();
        qu1.display();
        qu1.deQueue();
        qu1.display();
        qu1.deQueue();
        qu1.display();
        qu1.deQueue();
        qu1.display();
        qu1.deQueue();

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
