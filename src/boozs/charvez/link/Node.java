package boozs.charvez.link;

/**
 * 单向链表结点
 * @author  Dack
 */
public class Node {
    public  Node next;
    public  Object element;

    public Node (){

    }
    public Node (Object element){
        this.element = element;
    }
    public Node getNext() {
        return next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
