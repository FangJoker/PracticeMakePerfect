package boozs.charvez.BinaryTree;

/**
 * 二叉链表结点
 */
public class BiNode {
    private String elem;
    private BiNode leftChild;
    private BiNode rightChild;

    public BiNode() {
    }

    public BiNode(String elem) {
        this.elem = elem;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }

    public void setLeftChild(BiNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BiNode rightChild) {
        this.rightChild = rightChild;
    }

    public String getElem() {
        return elem;
    }

    public BiNode getLeftChild() {
        return leftChild;
    }

    public BiNode getRightChild() {
        return rightChild;
    }
}
