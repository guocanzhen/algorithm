package com.canzhen;

public class ArraySearch {
    public static void main(String[] args) {
        int[] array = {12,23,34,35,45,57,68,79,89,90};
        System.out.println(binSearch(array,45));
    }

//    二分查找法：数据需是有序不重复的,从小到大排序
    public static int binSearch(int[] array,int key){
        int mid;
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            mid = (end-start)/2 + start;
            if (key < array[mid]){
                end = mid -1;
            }else if (key > array[mid]){
                start = mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
