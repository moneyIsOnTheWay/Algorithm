package com.linli;

/**
 * @author lin
 * at 2018/3/18 16:42
 * 冒泡排序
 */
public class BubbleSort {

    void sort(int[] array) {
        for(int i =0;i < array.length - 1; i++){
            //外循环每执行一次，需要排序的值就少一个，所有j<array.length -1 -i
            for (int j = 0; j < array.length -1 -i; j ++){
                if(array[j+1] < array[j]){
                    //采用异或来交换两个变量的值
                    array[j+1] = array[j+1] ^ array[j];
                    array[j] = array[j+1] ^ array[j];
                    array[j+1] = array[j+1] ^ array[j];
                }
            }
        }
    }
}
