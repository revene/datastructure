package array;

public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    //指向队首的索引
    private int front;
    //指向队尾的索引的下一位
    private int tail;
    //元素的个数
    private int size;

    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity+1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public int getSize() {
        return size ;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
