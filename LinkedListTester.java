package Lab2;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.addFirst("aaa");
        myList.addFirst("bbb");
        myList.addFirst("ccc");
        myList.addFirst("ddd");
        myList.addFirst("eee");
        System.out.println(myList);
        System.out.println("Removed element:  " + myList.removeFirst());
        System.out.println("Removed element:  " + myList.removeFirst());
        System.out.println(myList);
        myList.addSecond("BBB");
        myList.addLast("XYZ");
        System.out.println(myList);

    }
}
