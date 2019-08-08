package boozs.dack.BinaryTree;


import java.util.Iterator;

/**
 * 二叉链表
 */
public class BiTree {

    /**
     * 递归先序遍历创建二叉链表
     *
     * @param t
     */
    public static void createBitree(Iterator<String> item, BiNode t) {
        String str = item.next();
        // 如果接收到'#'则构建空树，结束递归。
        if (str.equals("#")) {
            // java如果对象被重新创建或赋值为null，即会重新指向其他对象，不影响其原对象的值。这点很坑，所以如果左右子树为空，还是会有一个内容为空但对象不为空的结点对象，还是占用内存空间造成空间浪费。
            t = null;
        } else {
            t.setElem(str);
            // 为左子树申请对象实例
            t.setLeftChild(new BiNode());
            createBitree(item, t.getLeftChild());
            // 为右子树申请对象实例
            t.setRightChild(new BiNode());
            createBitree(item, t.getRightChild());
        }
    }

    /**
     * 递归中序遍历二叉树
     *
     * @param t
     */
    public static void midOrderTraverse(BiNode t) {
        if (t!= null) {
            midOrderTraverse(t.getLeftChild());
            System.out.println("[" + t.getElem() + "]");
            midOrderTraverse(t.getRightChild());
        }
    }


    /**
     * 递归先序遍历二叉树
     *
     * @param t
     */
    public static void firstOrderTraverse(BiNode t) {
        if (t != null) {
            System.out.println("[" + t.getElem() + "]");
            firstOrderTraverse(t.getLeftChild());
            firstOrderTraverse(t.getRightChild());
        }
    }

    /**
     * 递归后序遍历二叉树
     *
     * @param t
     */
    public static void afterOrderTraverse(BiNode t) {
        if (t != null) {
            afterOrderTraverse(t.getLeftChild());
            afterOrderTraverse(t.getRightChild());
            System.out.println("[" + t.getElem() + "]");
        }
    }

    /**
     * 先序递归复制二叉树
     *
     * @param t
     * @param newt
     */
    public static void copy(BiNode t, BiNode newt) {
        // 如果是树，递归结束
        if (t == null) {
            newt = null;
            return;
        } else {
            newt = new BiNode(t.getElem());
            copy(t.getLeftChild(), newt.getLeftChild());
            copy(t.getRightChild(), newt.getRightChild());
        }
    }

    /**
     * 计算二叉树深度
     *
     * @param t
     * @return
     */
    public static int depth(BiNode t) {
        if (t == null) {
            // 如果是空树，结束递归，深度为0
            return 0;
        } else {
            int m = depth(t.getLeftChild());
            int n = depth(t.getRightChild());
            if (m > n) {
                return m + 1;
            } else {
                return n - 1;
            }
        }
    }

    /**
     * 递归统计二叉树中结点个数
     *
     * @param t
     * @return
     */
    public static int nodeCount(BiNode t) {
        if (t == null) {
            // 空树结点个数为0，结束递归
            return 0;
        } else {
            // 左节点+右结点
            return nodeCount(t.getLeftChild())  + nodeCount(t.getRightChild()) + 1;
        }
    }
}
