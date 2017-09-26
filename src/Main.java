import search.BinarySearch;
import sort.InsertSort;

import java.util.Arrays;

public class Main {

    private static int[] nums=new int[]{10,7,15,8,4,98,50,23,26,34,8,35,9,66,90,33};


    public static void main(String[] args) {
        System.out.println("Hello World!");
        InsertSort insertSort=new InsertSort();
        insertSort.doSort(nums);
        BinarySearch binarySearch=new BinarySearch();
        binarySearch.doSearch(nums,34);
        System.out.println(Arrays.toString(nums));
    }
}
