package sort;

public class InvertArray {

    public void invert(int[] data){
        for(int index = 0; index<data.length/2;index++){
            int temp = data[index];
            data[index] = data[data.length -index- 1];
            data[data.length-index -1] = temp;
        }
    }

    public void invertR(int[] data, int index){
        if(index<data.length/2){
            int temp = data[index];
            data[index] = data[data.length -index- 1];
            data[data.length-index -1] = temp;
            invertR(data, index+1);
        }
    }
}
