package array;

public class Main {
    public static void main(String[] args) {
        //泛型不支持基本类型,要用包装类
        Array<Integer> array = new Array<Integer>(20);
        for (int i = 0; i < 10 ;i++){
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1,100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeElement(5);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);
    }
}
