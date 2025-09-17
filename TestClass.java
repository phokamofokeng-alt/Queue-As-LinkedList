public class TestClass
{
    public static void main (String []args)
    {
        QueueAsMyLinkedList <String> myQueue = new QueueAsMyLinkedList<>();

        System.out.println("\nInitial Queue: ");
        System.out.println(myQueue);

        myQueue.enqueue(new String ("Keith"));
        myQueue.enqueue(new String ("David"));
        myQueue.enqueue(new String ("Niel"));
        myQueue.enqueue(new String ("Zack"));

        System.out.println(myQueue);

        // LastIn-FirstOut
        myQueue.dequeue();
        System.out.println(myQueue);
    }
}