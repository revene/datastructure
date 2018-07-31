package array;

public class Array {

    private int[] data;

    private int size;


    //构造函数,传入数组的容量capacity构造Array
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    //无参数的构造函数,默认数组的容量capacity=10
    public Array(){
        this(10);
    }

    //获取数组中元素的个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //返回数据是否为空
    public boolean isEmpty(){
        return size == 0;
    }


    //向所有元素后添加一个新元素
    public void addLast(int e){
        add(size,e);
    }

    public void addFirst(int e){
        add(0,e);
    }

    //在第index个位置插入一个新元素e
    public void add(int index, int e){
        if (size == data.length){
            throw new IllegalArgumentException("Add failed. Array is full");
        }
        if (index > size || index <0){
            throw new IllegalArgumentException("Add failed. Require index >=0 && index > size");
        }
        for (int i = size -1 ; i >= index ; i--){
            data[i+1] = data[i];
        }

        data[index] = e;
        size ++;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n ",size,data.length));
        res.append('[');
        for (int i = 0 ; i < size ; i++){
            res.append(data[i]);
            if (i != size - 1 ){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }

    //获取index索引位置的元素
    public int get(int index){
        //通过这个get方法,用户永远无法访问没有装数据的数组空间
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("get failed");
        }
        return data[index];
    }

    //修改数组上某一个索引的值
    public void set(int index , int e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("get failed");
        }
        data[index] = e;
    }

    //查找数组中是否含有元素e
    public boolean contains(int e ){
        for (int i = 0 ;i < size ; i++){
            if (data[i] == e){
                return true;
            }
        }
        return false;
    }

    //查找数组中元素e所在的索引,如果不存在元素e,则返回-1
    public int find(int e){
        for (int i = 0 ;i< size;i++){
            if (data[i] == e){
                return i;
            }
        }
        return -1;
    }

    public int remove(int index){
        if (index < 0 || index>=size){
            throw new IllegalArgumentException("delete failed, index wrong");
        }
        int ret = data[index];
        for (int i = index;i<size; i++){
            data[i] = data[i+1];
        }
        size --;
        return ret;
    }

    //从数组中删除第一个元素
    public int removeFirst(){
        return remove(0);
    }

    //从数组中删除最后一个元素
    public int removeLast(){
        return remove(size-1);
    }

    //从数组中删除元素e
    public void removeElement(int e){
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }



}