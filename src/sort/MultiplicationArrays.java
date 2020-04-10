package sort;

public class MultiplicationArrays {

    public int[][] multiplication(int[][] arr1, int[][] arr2,int rowsF, int columnsF,int rowsS, int columnsS) {
        int sum;
        if (columnsF != rowsS) {
            return new int[0][0];
        } else {
            int[][] newArr = new int[rowsF][columnsS];
            for (int rowsElement = 0; rowsElement < rowsF; rowsElement++){
                for(int columnsElement = 0; columnsElement<columnsS;columnsElement++){
                    sum=0;
                    for(int index=0;index<columnsF;index++){
                        sum += arr1[rowsElement][index]*arr2[index][columnsElement];
                    }
                    newArr[rowsElement][columnsElement]=sum;
                }

            }
            return newArr;
        }
    }
}
