package com.linli;

/**
 * @author lin
 * at 2018/3/18 17:10
 * 选择排序
 */
public class SelectionSort {

    void sort(int[] array){
        int min_index = 0;
        int temp = 0;
        for (int i = 0;i < array.length - 1; i++){
            min_index = i;
            for (int j = i + 1;j < array.length; j++){
                //寻找最小的数
                if(array[j] < array[min_index]){
                   //将最小的数的索引保存
                    min_index = j;
                }
            }
            temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
    }
}
