package boozs.charvez.stack;

/**
 * 链栈结点
 */
public class StackNode {
    /**
     * 入栈元素
     */
    private long elem;

    private StackNode next;

    public void setElem(long elem) {
        this.elem = elem;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public long getElem() {
        return elem;
    }

    public StackNode getNext() {
        return next;
    }
}
