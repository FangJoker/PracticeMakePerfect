package zhuhai.boozs.charvez.search;

public class SerachUntil {

    /**
     * 二分查找  迭代 非递归实现
     *
     * @param array 有序递增数组
     * @param key   要查找的元素
     * @return 返回下标
     */
    public static int binarySearch(int[] array, int key) {
        int low = 1;
        int height = array.length;
        while (low <= height) {
            int mid = (height + low) / 2-1;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    /**
     * 二分查找 递归算法 时间复杂度 O（logN）
     *
     * @param r
     * @param key
     * @param low
     * @param height
     * @return
     */
   public static int  binarySearch(int r[], int key, int low, int height) {
        while (low <= height) {
            int mid = low + height / 2-1;
            if (r[mid] > key) {
                return binarySearch(r, key, low, mid-1);
            } else if (r[mid] < key) {
                return binarySearch(r, key, mid+1, height);
            } else if (r[mid] == key) {
                return mid;
            }
        }
        return -1;
    }
}
