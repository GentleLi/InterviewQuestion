package sort;

import utils.TraversalUtil;

/**
 * 插入排序
 * 时间复杂度：
 * 最坏：O(n^2)
 * 最好：O(n)
 * 平均：O(n^2)
 * Created by jiantao on 2017/9/22.
 */
public class InsertSort {
    private static final String TAG=InsertSort.class.getSimpleName();
    //例如数组 1,3,5,7,9,2,4,6,8,0
    public void doSort(int[] nums){
        System.out.println(TAG);
        int temp, length = nums.length;
        for (int i = 1; i < length; i++) {
            temp = nums[i];
            int j = i;
            for (; j >= 1&&temp < nums[j - 1]; j--) {
                nums [j] = nums[j - 1];
            }
            nums[j] = temp;
        }
        TraversalUtil.traverseArray(nums);
    }
}
