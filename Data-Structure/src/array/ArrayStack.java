package array;

public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    public ArrayStack(int capacity) {
        this.array = new Array<>(capacity);
    }

    public ArrayStack() {
        this.array = new Array<>();
    }


    //获取栈元素数量
    @Override
    public int getSize() {
        return array.getSize();
    }

    //判断栈是否为空
    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    //获取栈容量
    public int getCapacity(){
        return array.getCapacity();
    }

    //入栈操作
    @Override
    public void push(E e) {
        array.addLast(e);
    }

    //出栈操作
    @Override
    public E pop() {
        return array.removeLast();
    }

    //查看栈顶的数据
    @Override
    public E peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stack: ");
        stringBuilder.append("[");
        for (int i = 0; i<array.getSize();i++){
            stringBuilder.append(array.get(i));
            if (i != array.getSize()-1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("] top");
        return stringBuilder.toString();
    }
}
