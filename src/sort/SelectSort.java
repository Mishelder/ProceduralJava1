package sort;

public class SelectSort {

    public void sort(int[] arr){
        for(int barrier =0;barrier <arr.length-1;barrier++){
            for(int index = barrier+1;index<arr.length;index++){
                if(arr[barrier]>arr[index]){
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

    public void sortOptimised(int[] arr){
        for(int barrier =0;barrier <arr.length-1;barrier++){
            int min = arr[barrier];
            int requireIndex=barrier;
            for(int index = barrier+1;index<arr.length;index++){
                if(min>arr[index]){
                    requireIndex = index;
                    min = arr[requireIndex];
                }
            }
            int temp = arr[barrier];
            arr[barrier] = arr[requireIndex];
            arr[requireIndex] = temp;
        }
    }


}
