package zhuhai.boozs.charvez.sort;

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

    /**
     * 快速排序
     * 不稳定
     * 时间复杂度 最差 O(n2)
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
            while (low < height && r[height] >=pivotkey){
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

}
