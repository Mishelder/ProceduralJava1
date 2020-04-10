package Test;

import sort.BubbleSort;
import sort.InsertSort;
import sort.SelectSort;

import java.util.Arrays;

public class TestSort {


    public static void main(String[] args) {
        int size = 100000;
        int a[] = new int[size];
        int b[] = new int[size];
        int d[] = new int[size];
        int c[] = new int[size];
        int e[] = new int[size];
        int f[] = new int[size];
        fillIncrease(a);
        fillIncrease(b);
        fillIncrease(d);
        fillIncrease(c);
        fillIncrease(e);
        fillIncrease(f);
        System.out.println(Arrays.toString(a));
        SelectSort selectSort = new SelectSort();
        InsertSort insertSort = new InsertSort();
        BubbleSort bubbleSort = new BubbleSort();


        long t0 = System.nanoTime();
        selectSort.sort(a);
        System.out.println("SelectSort: " + (System.nanoTime() - t0)/1_000_000_000d);

        long t1 = System.nanoTime();
        selectSort.sortOptimised(b);
        System.out.println("SelectSortOptimised: " + (System.nanoTime() - t1)/1_000_000_000d);

        long t2 = System.nanoTime();
        insertSort.sort(c);
        System.out.println("InsertSort: " + (System.nanoTime() - t2)/1_000_000_000d);

        long t3 = System.nanoTime();
        insertSort.sortOptimised(d);
        System.out.println("InsertSortOptimised: " + (System.nanoTime() - t3)/1_000_000_000d);

        long t4 = System.nanoTime();
        bubbleSort.sort(e);
        System.out.println("BubbleSort: " + (System.nanoTime() - t4)/1_000_000_000d);

        long t5 = System.nanoTime();
        bubbleSort.sortOptimised(f);
        System.out.println("BubbleSortOptimised: " + (System.nanoTime() - t5)/1_000_000_000d);


    }

    public static void fillArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] =1+(int) (Math.random()*100);
        }
    }

    public static void fillDecrease(int[] arr){
        arr[0] =1+(int) (Math.random()*10000);
        for(int i=1;i<arr.length;i++){
            arr[i] =arr[i-1]-(1+(int) (Math.random()*10));
        }
    }

    public static void fillIncrease(int[] arr){
        arr[0] =1+(int) (Math.random()*10);
        for(int i=1;i<arr.length;i++){
            arr[i] =(1+(int) (Math.random()*100))+arr[i-1];
        }
    }
}
