package zhuhai.boozs.charvez.sort;

import java.util.HashMap;

public class SortUntil {

    /**
     * 直接插入排序
     * 时间复杂度O(n2)
     * =========稳定排序========== 除此之外还有归并排序
     *
     * @param array
     */
    public static void insertSort(int[] array) {
        int i, j, temp = 0;
        for (i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                temp = array[i];
                array[i] = array[i - 1];
                for (j = i - 1; temp < array[j]; j--) {
                    array[j + 1] = array[j];
                }
                // 因为上面有j--所以加回来
                array[j + 1] = temp;
            }
        }
    }
    //==================快速排序===============================//

    /**
     * 快速排序
     * 不稳定
     * 时间复杂度 最差（逆序排序） O(n2)
     * 平均O(nlog2n)
     *
     * @param r
     */
    public static void quickSort(int r[]) {
        qSort(r, 0, r.length - 1);
    }

    /**
     * 快速排序拆分字表的过程，返回两个字表直接中间的数字的下标，即low。用于下面快速排序递归
     *
     * @param r
     * @param low    初始值为0
     * @param height 初始值为表的长度
     * @return
     */
    private static int partition(int r[], int low, int height) {
        int pivotkey = r[low];
        while (low < height) {
            while (low < height && r[height] >= pivotkey) {
                --height;
            }
            r[low] = r[height];
            while (low < height && r[low] <= pivotkey) {
                ++low;
            }
            r[height] = r[low];
        }
        // 此时r[low] 的值不是pivotkey 所以要赋值给它
        r[low] = pivotkey;
        return low;
    }

    /**
     * 快速排序递归过程
     *
     * @param r
     * @param low
     * @param height
     */
    private static void qSort(int r[], int low, int height) {
        if (low < height) {
            int pivotloc = partition(r, low, height);
            //递归左字表
            qSort(r, low, pivotloc - 1);
            //递归右字表
            qSort(r, pivotloc + 1, height);
        }
    }
    //==================快速排序===============================//

    //==================堆排序===============================//

    /**
     * 筛选法调整堆
     * 1.设r[s]为堆的根
     * 2.比较r[2s+1]（左）与r[2s+2] （右）假设r[2s+1]大
     * 3.比较r[s]与r[2s+1]，若r[s]>=r[2s+1]则不需要调整，反之交换r[s]与r[2s+1]
     * 4.以r[2s+2]为的根的子树仍是堆，如果以r[2s+1]为根的子树不是堆，重复以上。
     *
     * @param r 堆
     * @param s 需要调整的结点
     * @param m 最后一个堆元素的下标
     *          完全二叉树的左结点的序号为父结点的2倍+1，右结点的为2倍+2
     */
    private static void HeapAdjust(int[] r, int s, int m) {
        int temp = r[s];
        for (int j = 2 * s + 1; j < m; j = 2 * j + 1) {
            if (j < m && r[j] < r[j + 1]) {
                j++;
            }
            if (temp >= r[j]) {
                //根结点最大，不需要调整
                break;
            }
            r[s] = r[j];
            // s变为下一个结点，直到叶子(j>=m)为止。
            s = j;
        }
        //将一开始的根结点插入到正确的位置
        r[s] = temp;
    }

    /**
     * 初建堆
     * 把无序序列建成大根堆
     *
     * @param r 无序序列
     */
    private static void createHeap(int r[]) {
        int n = r.length - 1;
        //从中间开始筛选（非终端结点）一直到根结点
        for (int i = n / 2; i >= 0; i--) {
            // 反复调整堆
            HeapAdjust(r, i, n);
        }
    }

    /**
     * 堆排序
     * 平均时间复杂度O(nlong2n) ，比起快速排序最差时间复杂度O（n2）好一点
     * 只适用于顺序表
     *
     * @param r 待排序序列
     */
    public static void heapSort(int r[]) {
        //建立初始大根堆
        createHeap(r);
        for (int i = r.length - 1; i > 0; i--) {
            // 将堆顶元素与最后一个元素交换
            int x = r[0];
            r[0] = r[i];
            r[i] = x;
            //重新调整堆为大根堆
            HeapAdjust(r, 0, i - 1);
        }
    }


}
