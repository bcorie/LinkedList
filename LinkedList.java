package Lab2;

/**
 * @author Corie Beale
 */

import java.util.NoSuchElementException;
public class LinkedList{
    class Node {
        private Object element;
        private Node next;
    }

    private Node first;

    public LinkedList() {
        first = null;
    }

    /**
     * Defines the element Object
     * of the first node.
     */
    public void setElement(Object obj){
        first.element = obj;
    }

    /**
     * @return element Object of first node
     */
    public Object getElement(){
        return first.element;
    }

    public Object getFirst(){
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.element;
    }

    public void addFirst(Object element) {
        Node node = new Node();
        node.element = element;
        node.next = first;
        first = node;
    }

    public Object removeFirst(){
        if (first == null){
            throw new NoSuchElementException();
        }
        Object removed = first.element;
        first = first.next;

        return removed;
    }

    public void addSecond(Object elem){
        Node second = new Node();
        second.element = elem;
        Node third = first.next; //third-to-be

        second.next = third; // second -> third
        first.next = second; // first -> second
    }

    public void addLast(Object elem){
        Node temp = first;
        Node last = new Node();
        last.element = elem;

        //search for end of list
        do {
            temp = temp.next;
        } while (temp.next != null);

        //insert temp after last
        temp.next = last;
    }

    public String toString(){
        String temp = "";
        Node current = first;
        while (current != null) {
            temp = temp + current.element.toString() +
                    '\n';current = current.next;
        }
        return temp;
    }
}
