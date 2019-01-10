package com.now;

/**
 * 适配器类
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort quickSort;
    private BinarySort binarySort;

    public OperationAdapter(){
        quickSort = new QuickSort();
        binarySort = new BinarySort();
    }

    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    public int search(int[] array, int key) {
        return binarySort.binarySearch(array,key);
    }
}
