package com.linli;

public class Main {

    static int[] array = {2,1,-1,3,6,5,9,7,10,8};

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        for (int value: array) {
            System.out.println(value);
        }
    }
}
