package array;

public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayQueue() {
        this.array = new Array<>();
    }

    //获取队列中元素的大小
    @Override
    public int getSize() {
        return array.getSize();
    }

    //队列是否为空
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    //获取队列容量
    public int getCapacity(){
        return array.getCapacity();
    }

    //入队操作
    @Override
    public void enqueue(E e) {
       array.addLast(e);
    }

    //出队操作
    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    //查看队首是谁
    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Queue: ");
        stringBuilder.append("front [");
        for (int i = 0 ; i < array.getSize() ; i++){
            stringBuilder.append(array.get(i));
            if (i != array.getSize()-1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("] tail");
        return stringBuilder.toString();
    }
}
