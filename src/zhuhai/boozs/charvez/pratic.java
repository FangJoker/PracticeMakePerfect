package zhuhai.boozs.charvez;


import zhuhai.boozs.charvez.search.SerachUntil;
import zhuhai.boozs.charvez.sort.SortUntil;

/**
 * @author charvez
 */
public class pratic {

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

        int[] array = new int[7];
        array[0] = 3;
        array[1] = 0;
        array[2] = 2;
        array[3] = 2;
        array[4] = 5;
        array[5] = 1;
        array[6] = 4;
        SortUntil.heapSort(array);
        for (int i =0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }


    }

}
