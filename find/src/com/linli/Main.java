package com.linli;

public class Main {

    static int[] order_array = {1,2,3,4,5,7,11,32,33,34,44};
    static int[] array = {2,1,4,5,7,6,9,8,66,34,54,35};

    public static void main(String[] args) {

        BinSearch binSearch = new BinSearch();
        System.out.println(binSearch.find(order_array,44));

        SequenceSearch sequenceSearch = new SequenceSearch();
        System.out.println(sequenceSearch.find(array,2));
    }
}
