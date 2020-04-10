package sort;

public class BubbleSort {

    public void sortOptimised(int[] data){
        for(int barrier = 0; barrier<data.length;barrier++){
            for(int index = data.length-1;index>barrier;index--){
                if(data[index]<data[index-1]) {
                    int temp = data[index];
                    data[index] = data[index - 1];
                    data[index - 1] = temp;
                }
            }
        }
    }

    public void sort(int[] data){
        for(int barrier = 0;barrier<data.length;barrier++){
            for(int index = 0;index<data.length-barrier-1;index++) {
                if (data[index] > data[index + 1]) {
                    int temp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = temp;
                }
            }
        }
    }


}
