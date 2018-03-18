package com.linli;

/**
 * @author lin
 * at 2018/3/18 12:05
 * 二分查找：
 * 思路：对于有序的序列，通常采用二分查找的方式
 * 从中间开始找，如果找到就直接返回位置,如果对象小于中间这个值则对前面部分继续相同操作(从中间开始找)
 * 如果大于也一样的
 */
public class BinSearch {

    /**
     * 查找实现
     * @param array 有序数组
     * @param value 查找对象
     * @return
     */
    int find(int [] array, int value){
        int start = 0;
        int end = array.length -1;
        while (start <= end){
            //防止溢出 use >>>
            int mid = (start + end) >>> 1;
            if(array[mid] == value){
                return mid;
            }else if(array[mid] > value){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
