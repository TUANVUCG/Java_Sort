package Illustration_BubbleSort;

public class BubbleSort {
    public void bubbleSort(int[] arr){
        boolean k = false;
        for(int i = 0; i<arr.length; i++){
            for(int j = i +1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    k = true;
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        if(!k){
            System.out.println("Mảng đã sắp xếp rồi ");
        }
    }
}
