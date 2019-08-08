package boozs.dack.link;

/**
 * 循环双向链表的实现
 *
 * @author Dack
 */
public class DoubleLinkList {
    /**
     * 头结点
     */
    private DoubleNode head;
    /**
     * 尾部结点
     */
    private DoubleNode tail;
    /**
     * 链表长度
     */
    public int length = 0;

    public DoubleLinkList() {
        head = new DoubleNode();
        tail = new DoubleNode();
        head.setNext(tail);
        head.setPre(tail);
        tail.setNext(head);
        tail.setPre(head);
    }

    /**
     * 链表是否为空
     *
     * @return
     */
    public Boolean isEmpty() {
        if (head.getNext() == tail) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 在链表的末尾直接插入一个元素
     *
     * @param elem
     * @return
     */
    public Boolean addElem(Object elem) {
        DoubleNode newNode = new DoubleNode(elem);
        // 若链表为空，直接在头结点和尾结点中插入
        if (isEmpty()) {
            head.setNext(newNode);
            tail.setPre(newNode);
            newNode.setNext(tail);
            newNode.setPre(head);
            length++;
            return true;
        } else {
            // 在最后一个结点插入，连接尾部
            DoubleNode lastNode = tail.getPre();
            lastNode.setNext(newNode);
            newNode.setPre(lastNode);
            newNode.setNext(tail);
            tail.setPre(newNode);
            length++;
            return true;
        }
    }

    /**
     * 在指定位置插入 O(n) n为链表长度L/2
     *
     * @param elem
     * @param index
     * @return
     */
    public Boolean addElem(Object elem, int index) {
        if (isOutBound(index)) {
            return false;
        }
        DoubleNode newNode = new DoubleNode(elem);
        //如果插入的位置在链表后半部分则从尾部开始寻找index结点，反之从头部开始
        if (index > length / 2) {
            DoubleNode indexNextNode = tail.getPre();
            int j = length;
            while (indexNextNode != head && j > index + 1) {
                indexNextNode = indexNextNode.getPre();
                j--;
            }
            DoubleNode indexNode = indexNextNode.getPre();
            newNode.setPre(indexNode.getPre());
            indexNode.getPre().setNext(newNode);
            newNode.setNext(indexNode);
            indexNode.setPre(newNode);
            length++;
            return true;
        } else {
            DoubleNode indexPreNode = head.getNext();
            int j = 0;
            // 找到Index 的前一个
            while (indexPreNode != null && j < index - 1) {
                indexPreNode = head.getNext();
                j++;
            }
            DoubleNode indexNode = indexPreNode.getNext();
            newNode.setNext(indexNode);
            newNode.setPre(indexPreNode);
            indexNode.setPre(newNode);
            indexPreNode.setNext(newNode);
            length++;
            return true;
        }
    }

    /**
     * 获取指定位置内容
     *
     * @param index
     * @return
     */
    public Object getIndexOf(int index) {
        if (isOutBound(index)) {
            return null;
        }
        if (index > length / 2) {
            DoubleNode indexNode = tail;
            for (int j = length; j > index - 1; j--) {
                indexNode = indexNode.getPre();
            }
            return indexNode.getElem();
        } else {
            DoubleNode indexNode = head;
            for (int j = 0; j < index - 1; j++) {
                indexNode = indexNode.getNext();
            }
            return indexNode.getElem();
        }
    }

    public Boolean deleteIndexOf(int index) {
        if (isOutBound(index)) {
            System.out.println("越界");
            return false;
        }
        if (index > length / 2) {
            DoubleNode indexNode = tail.getPre();
            for (int j = length; j > index; j--) {
                indexNode = indexNode.getPre();
                System.out.println("j" + j);
            }
            DoubleNode indexNextNode = indexNode.getNext();
            indexNextNode.setPre(indexNode.getPre());
            indexNode.getPre().setNext(indexNextNode);
            length--;
            indexNode = null;
            return true;
        } else {
            DoubleNode indexNode = head.getNext();
            for (int j = 0; j < index - 1; j++) {
                indexNode = indexNode.getNext();
            }
            DoubleNode indexPreNode = indexNode.getPre();
            indexPreNode.setNext(indexNode.getNext());
            indexNode.getNext().setPre(indexPreNode);
            length--;
            indexNode = null;
            return true;
        }
    }

    /**
     * 判断是否越界
     *
     * @param index
     * @return
     */
    public Boolean isOutBound(int index) {
        if (index > length || index < 1) {
            System.out.println("越界");
            return true;
        } else {
            return false;
        }
    }

    /**
     * 打印整条链表
     */
    public void printLink() {
        DoubleNode next = head;
        while (next.getNext() != tail) {
            System.out.println(next.getNext().getElem());
            next = next.getNext();
        }
    }
}
