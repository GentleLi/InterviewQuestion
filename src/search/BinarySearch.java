package search;

/**
 * Created by jiantao on 2017/9/26.
 */
public class BinarySearch {

    public int doSearch(int[] arr,int target){
        int low=0;
        int high=arr.length;
        while (low<=high){
            int mid=(low+high)>>1;
            if (arr[mid]>target){//target 在 [0~mid-1]区间内
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                System.out.println("find target "+target+"  index = "+mid);
                return mid;//find target
            }
        }
        return -1;//not found
    }
}
