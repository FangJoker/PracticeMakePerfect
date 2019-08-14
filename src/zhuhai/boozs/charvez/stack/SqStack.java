package zhuhai.boozs.charvez.stack;


/**
 * 顺序栈
 */
public class SqStack {
    /**
     * 栈的长度
     */
    private int size;
    /**
     * 入栈的元素
     */
    private long elem;
    /**
     * 栈顶
     */
    private int top;
    /**
     * 为栈动态分配的数组
     */
    private long[] stackArray;

    public SqStack(int size) {
        this.size = size;
        this.stackArray = new long[size];
        // 空栈
        top = -1;
    }

    /**
     * 栈是否已满
     *
     * @return
     */
    public Boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 是否空栈
     *
     * @return
     */
    public Boolean isEmpty() {
        if (top == -1) {
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
        if (isFull()) {
            System.out.println("栈已满");
            return;
        } else {
            stackArray[++top] = elem;
        }
    }

    /**
     * 出栈
     */
    public long pop() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return 0;
        } else {
            long elem = stackArray[top];
            // 删除栈顶元素
            stackArray[top] = 0;
            --top;
            return elem;
        }
    }

    /**
     * 获取栈顶
     *
     * @return
     */
    public long getTop() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return 0;
        } else {
            return stackArray[top];
        }
    }

    /**
     * 打印
     */
    public void printStack() {
        if (isEmpty()) {
            System.out.println("栈为空");
            return;
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println("["+stackArray[i]+"]");
            }
        }
    }
}
