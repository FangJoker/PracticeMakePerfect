package boozs.charvez;


import boozs.charvez.link.DoubleLinkList;
import boozs.charvez.sort.sortUntil;

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
//            DoubleLinkList doubleLinkList = new DoubleLinkList();
//            for (int i=0; i<500;i++){
//                doubleLinkList.addElem(i);
//            }
//            doubleLinkList.printLink();
//           System.out.println( doubleLinkList.getIndexOf(450));
        int[] array = new int[6];
        array[0] = 0;
        array[1] = 3;
        array[2] = 2;
        array[3] = 6;
        array[4] = 5;
        array[5] = 1;
        sortUntil.insertSort(array);
        for (int i =0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void printArry(char[] arry, int k) {
        if (k < arry.length) {
            System.out.println(arry[k]);
            printArry(arry, k + 1);
        }
    }

}