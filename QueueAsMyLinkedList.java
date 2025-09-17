public class QueueAsMyLinkedList<T>
{
    MyLinkedList<T> theQueue;

    public QueueAsMyLinkedList()
    {
        theQueue = new MyLinkedList<>();

    }

    // Add to queue using LL (at end of queue)
    public void enqueue(T element)
    {
        //append from LL
        theQueue.append(element);

    }

    // Remove from queue using LL (at front of queue)
    public T dequeue()
    {
        T removed = theQueue.getFirst();
        // if queue is empty
        if( removed == null)
        {
            return null;
        }
        else
        {
            
            theQueue.delete(removed);

            return removed;

        }
    }

    // String method
    public String toString()
    {
        return theQueue.toString();

    }
}