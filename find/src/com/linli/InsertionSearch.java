package com.linli;

/**
 * @author lin
 * at 2018/3/18 12:54
 * 插值查找
 * 基本思想：基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。当然，差值查找也属于有序查找
 * 为什么二分查找一定是二分呢？插值查找的原理就是将二改为自适应（即要查找的对象在被查找对象位置的几分之几）
 */
public class InsertionSearch {

    int find(int[] array, int value){
        int start = 0;
        int end = array.length -1;
        while (start < end){
            int mid = start + (value - array[start])/(array[end] - array[start]) * (end - start);
            if(array[mid] == value){
                return mid;
            }else if(array[mid] < value){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }

}
