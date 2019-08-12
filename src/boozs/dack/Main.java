package boozs.dack;


import boozs.dack.BinaryTree.BiNode;
import boozs.dack.BinaryTree.BiTree;
import boozs.dack.link.DoubleLinkList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//        BiNode biTree = new BiNode();
////        BiNode tree = new BiNode("");
////        ArrayList<String> arry = new ArrayList();
////        arry.add("a");
////        arry.add("b");
////        arry.add("c");
////        arry.add("#");
////        arry.add("#");
////        arry.add("d");
////        arry.add("#");
////        arry.add("#");
////        arry.add("#");
////        Iterator<String> i = arry.iterator();
////        BiTree.createBitree(i, tree);
////        System.out.println("=============");
////        BiTree.firstOrderTraverse(tree);
////        System.out.println("=============");
////        System.out.println(BiTree.nodeCount(tree));
            DoubleLinkList doubleLinkList = new DoubleLinkList();
            for (int i=0; i<500;i++){
                doubleLinkList.addElem(i);
            }
           System.out.println( doubleLinkList.getIndexOf(501));

    }

    public static void printArry(char[] arry, int k) {
        if (k < arry.length) {
            System.out.println(arry[k]);
            printArry(arry, k + 1);
        }
    }

}
