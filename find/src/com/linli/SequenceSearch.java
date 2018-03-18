package com.linli;

/**
 * @author lin
 * at 2018/3/18 12:41
 * 顺序查找，如果数据量很大，效率极低
 */
public class SequenceSearch {

    int find(int [] array, int value){

        for(int i = 0;i<array.length;i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
