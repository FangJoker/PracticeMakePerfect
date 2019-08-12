package boozs.dack.search;

public class serachUntil {

    /**
     * 二分查找
     * @param array 有序递增数组
     * @param key 要查找的元素
     * @return 返回下标
     */
    public static int BinarySearch(int[] array, int key) {
        int low = 1;
        int height = array.length;
        while (low <= height) {
            int mid = (height + low) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                height = mid - 1;
            } else {
                height = mid + 1;
            }
        }
        return 0;
    }
}
