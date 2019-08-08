package boozs.dack.link;

/**
 * 双向链表的结点
 * @author  Dack
 */
public class DoubleNode {
    /**
     * 前驱
     */
    private DoubleNode pre;
    /**
     * 后继
     */
    private DoubleNode next;
    /**
     * 元素
     */
    private Object elem;

    public DoubleNode(){

    }

    public DoubleNode(Object elem){
        this.elem = elem;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public void setPre(DoubleNode pre) {
        this.pre = pre;
    }

    public void setElem(Object elem) {
        this.elem = elem;
    }

    public Object getElem() {
        return elem;
    }

    public DoubleNode getNext() {
        return next;
    }

    public DoubleNode getPre() {
        return pre;
    }
}
