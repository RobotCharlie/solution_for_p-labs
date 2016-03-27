
public interface MyQueue<T>{
    public MyQueue<T> enQueue(T t);
//    #Removes the element at the beginning of the immutable queue, and returns the new queue.
    public MyQueue<T> deQueue();
    public T head();
    public boolean isEmpty();
}
