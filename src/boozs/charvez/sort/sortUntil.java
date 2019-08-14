package boozs.charvez.sort;

public class sortUntil {

    /**
     * 直接插入排序
     *
     * @param array 待排序数组
     */
//    public static void insertSort(int[] array) {
////        int j = 0;
////        for (int i = 2; i < array.length; i++) {
////            if (array[i] < array[i - 1]) {
////                array[0] = array[i];
////                array[i] = array[i - 1];
////                // 防止数组下溢出，用array[0]作为哨兵
////                for (j = i-2; array[0]<array[j];j--){
////                    array[j+1]=array[j];
////                }
////                // 因为上面有j--所以加回来
////                array[j+1] = array[0];
////            }
////        }
////    }

    /**
     * 直接插入排序，无哨兵
     * 时间复杂度O(n2)
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
}
