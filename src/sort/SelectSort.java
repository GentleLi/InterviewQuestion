package sort;

/**
 * 选择排序
 * 时间复杂度：
 * 最坏O(n^2)
 * 最好O(n^2)
 * 平均O(n^2)
 * Created by jiantao on 2017/9/22.
 */
public class SelectSort {

    public void doSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {//找出最小的一个索引
                if (arr[minIndex] > arr[j]) {
                    minIndex=j;
                }
            }
            //交换
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] ="+arr[i]);
        }
    }
}
