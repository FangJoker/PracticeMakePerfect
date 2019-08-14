package zhuhai.boozs.charvez.link;

/**
 * 单向链表的实现
 * @author Dack
 */
public class LinkList {
    /**
     * 头结点
     */
    private Node head;
    /**
     * 链表长度
     */
    private int length = 0;

    public LinkList() {
        // 生成头部节点
        head = new Node();
        // 头指针置空
        head.setNext(null);
    }

    public Node getHead() {
        return head;
    }

    /**
     * 在链表末尾添加元素
     *
     * @param elem
     */
    public boolean addElem(Object elem) {
        Node newNode = new Node(elem);
        // 如果链表为空则直接插入
        if (head.getNext() == null) {
            head.setNext(newNode);
            newNode.setNext(null);
        } else {
            Node next = head.getNext();
            while (next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(newNode);
            newNode.setNext(null);
        }
        length++;
        return true;
    }

    public Boolean addElem(Object elem, int index) {
        int j = 0;
        Node preNext = head;
        // index>length 与index<1  与空链表 都是不合理
        if (preNext == null || index > length || index < 1) {
            System.out.println("插入失败");
            return false;
        }
        // 查找到index上一个节点
        while (preNext != null && (j < index - 1)) {
            ++j;
            preNext = preNext.getNext();
        }
        Node newNode = new Node(elem);
        Node indexNode = preNext.getNext();
        preNext.setNext(newNode);
        newNode.setNext(indexNode);
        length++;
        return true;
    }

    public Boolean deleteElm(int index) {
        int j = 0;
        Node preNext = head;
        // index>length 与index<1  与空链表 都是不合理
        if (preNext == null || index > length || index < 1) {
            System.out.println("删除失败");
            return false;
        }
        // 查找到index上一个节点
        while (preNext != null && (j < index - 1)) {
            ++j;
            preNext = preNext.getNext();
        }
        Node nextNode = preNext.getNext().getNext();
        // 将Index的结点置空
        Node indexNode = preNext.getNext();
        indexNode = null;
        // 链接 前一个和后一个结点
        preNext.setNext(nextNode);
        length--;
        return true;

    }

    /**
     * 获取指定位置元素
     * 时间复杂度 O(n) n 为链表长度
     *
     * @param index
     * @return
     */
    public Object getIndexOf(int index) {
        if (isOutBound(index)) {
            return null;
        }
        // 从头结点开始
        int j = 0;
        Node next = head;
        while (next.getNext() != null && j < index) {
            j++;
            next = next.getNext();
        }
        return next.getElement();
    }

    /**
     * 修改链表指定位置结点
     *
     * @param index
     * @param elem
     * @return
     */
    public Boolean setIndexOf(int index, Object elem) {
        if (isOutBound(index)) {
            return false;
        }
        int j = 0;
        Node preNode = head;
        while (preNode != null && j < index - 1) {
            j++;
            preNode = preNode.getNext();
        }
        Node newNode = new Node(elem);
        Node indexNode = preNode.getNext();
        newNode.setNext(indexNode.getNext());
        preNode.setNext(newNode);
        return true;
    }

    /**
     * 打印整条链表
     */
    public void printLink() {
        Node next = head;
        while (next.getNext() != null) {
            System.out.println(next.getNext().getElement());
            next = next.getNext();
        }
    }

    /**
     * 递归打印
     */
    public void recursionPrintLink(Node next){
        if (next!=null) {
            System.out.println(next.getElement());
            recursionPrintLink(next.getNext());
        }
    }

    /**
     * 判断是否越界
     *
     * @param index
     * @return
     */
    private Boolean isOutBound(int index) {
        // index 位置无效
        if (index < 1 || index > length) {
            System.out.println("越界");
            return true;
        } else {
            return false;
        }
    }
}
