package boozs.charvez.stack;

/**
 * 链栈
 */
public class LinkStack {

    private StackNode top;

    public LinkStack() {
        // 构造一个空栈
        top = null;
    }

    /**
     * 是否空栈
     *
     * @return
     */
    public Boolean isEmpty() {
        if (top == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 入栈
     *
     * @param elem
     */
    public void push(long elem) {
        StackNode newStackNode = new StackNode();
        newStackNode.setElem(elem);
        newStackNode.setNext(top);
        top = newStackNode;
    }

    /**
     * 出栈
     *
     * @return
     */
    public long pop() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return 0;
        } else {
            long popElem = top.getElem();
            top = top.getNext();
            return popElem;
        }
    }

    /**
     * 获得栈顶元素
     *
     * @return
     */
    public long getTop() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return 0;
        } else {
            return top.getElem();
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return;
        } else {
            StackNode stackNode = top;
            while (stackNode != null) {
                System.out.println(stackNode.getElem());
                stackNode = stackNode.getNext();
            }
        }
    }
}
