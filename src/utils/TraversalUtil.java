package utils;

/**
 * 遍历工具
 * Created by jiantao on 2017/9/22.
 */
public class TraversalUtil {
    /**
     * 遍历数组
     * @param arr
     */
    public static void traverseArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"] = "+arr[i]);
        }
    }
}
