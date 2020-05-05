package com.canzhen;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {11,25,34,3,6,8,89,76,1};
        System.out.println("原数组：");
        print(array);
        System.out.println("===============");
//        selectSort(array);//直接排序
//        bubbleSort(array);//冒泡排序
        insertSort(array);//插入排序
        System.out.println("结果数组：");
        print(array);
    }

//    打印
    public static void print(int[] array){
        for (int a :
                array) {
            System.out.println(a);
        }
    }

//    直接排序：数组的第一个数a[0]和后面所有的数进行比对，得到最小的数，然后第二个数a[1]和后面所有的数进行比对，得到次小的数。。。
    public static void selectSort(int[] array){
        for (int i =0; i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
//冒泡排序：冒泡排序是两两之间进行对比，这样最大的一个数就到了数组的最后，第二次进行比对的时候只要比数组长度-2次，就是<arr.length-1，即可得到次大的数，放在倒数第二的位置，如此反复得到排序后的数组
    public static void bubbleSort(int[] array){
        for (int i =0; i<array.length-1;i++){
            for (int j =0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
//    插入排序：插入排序和打牌一样，拿到一个数和前面已有的数进行对比，比前面的数小就放到前面
    public static void insertSort(int[] array){
        for (int i=1; i<array.length;i++){
            for (int j=i;j>0;j--){
                if (array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else break;
            }
        }
    }

}
