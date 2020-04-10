package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertSort {

    public void sort (int[] data){

        for(int barrier = 1; barrier<data.length;barrier++ ){
            int newElement = data[barrier];
            int location =barrier-1;
            while(location>=0&&data[location]>newElement){
                data[location+1]=data[location];
                location--;
            }
            data[location+1] = newElement;
        }

    }

    public void sortOptimised(int[] data){
        for(int barrier = 1; barrier<data.length;barrier++ ){
            int newElement = data[barrier];
            int location =Arrays.binarySearch(data,0,barrier,newElement);

            if(location>=0){
                System.arraycopy(data,location,data,location+1,barrier-location);
                data[location] = newElement;

            }else{
                location = -(location+1);
                System.arraycopy(data,location,data,location+1,barrier-location);
                data[location] = newElement;
            }

        }
    }

    public int binarySearch(int[] a,int num){
        int begin = 0;
        int end = a.length-1;

        while(begin<=end){
            int mid = (begin +end)/2;
            if(num>a[mid]){
                begin = mid+1;
            }else if(num<a[mid]){
                end = mid-1;
            }else
                return mid;

        }
        return -(begin+1);
    }
}
