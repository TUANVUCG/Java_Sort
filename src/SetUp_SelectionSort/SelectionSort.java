package SetUp_SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1,3,8,4,2,12};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length;i++){
            int nowMin = arr[i];
            int index = i;
            for(int j = i +1; j<arr.length;j++){
                if(nowMin>arr[j]){
                    nowMin = arr[j];
                    index = j;
                }
            }
            if(index!=i){
                arr[index] = arr[i];
                arr[i] = nowMin;
            }
        }
    }
}
